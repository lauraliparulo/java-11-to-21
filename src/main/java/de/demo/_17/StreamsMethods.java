package de.demo._17;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingLong;
import static java.util.stream.Collectors.teeing;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

import java.util.stream.Stream;

public class StreamsMethods {

	public static void main(String[] args) {
		
		//teeing
		
		System.out.println(calcCountAndSum(Stream.of(1,2,3,4,5)));
		
		//toList
		
		var names = Stream.of("Michael","Tim","Tom","Mike");
		
		final Predicate<String> startsWithMi = text -> text.startsWith("Mi");
		final Predicate<String> endsWithM = text -> text.endsWith("m");
		
		
		var result = names.collect(teeing(
				filtering(startsWithMi, toList()), 
				filtering(endsWithM, toList()), 
				(list1,list2) -> List.of(list1,list2)));
		
		System.out.println(result);
		
		List<String> namesMi = Stream.of("Tim","Tom","Mike","Michael").filter(str -> str.startsWith("Mi")).toList();
		
		//mapMulti
		
		var results = List.of(Optional.of("0"),Optional.empty(),Optional.of("4"));
		
		results.stream().flatMap(Optional::stream).forEach(System.out::println);
		
		results.stream().mapMulti(Optional::ifPresent).forEach(System.out::println);
		
	}


	private static LongPair calcCountAndSum(Stream<Integer> numbers) {
		return numbers.collect(teeing(counting(), summingLong(n ->n), (count, sum) -> new LongPair(count, sum)));
	}
	
	
}


record LongPair(long count, long sum) {}