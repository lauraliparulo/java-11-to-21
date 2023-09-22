package de.demo._17;


import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

public class PredicateNot {
	
	public static void main(String[] args) {
		
		final Predicate<String> notEmptyString = not(String::isBlank);
		
		var words = Stream.of("this", " ", "ist", "   ", "ein"," ","Text");
		
		System.out.println(words.filter(notEmptyString).collect(Collectors.joining(" ")));
		
		
	}

}
