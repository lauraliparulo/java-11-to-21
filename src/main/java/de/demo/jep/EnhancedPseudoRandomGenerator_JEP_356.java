package de.demo.jep;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class EnhancedPseudoRandomGenerator_JEP_356 {
	
	public static void main(String[] args) {
		
		RandomGeneratorFactory.all().map(fac -> fac.group() + ": "+fac.name()).sorted().forEach(System.out::println);
		
		var random = RandomGenerator.JumpableGenerator.of("Xoroshiro128PlusPlus");
		
		random.nextInt();
		
		random.nextDouble();
		
		random.ints(3,1,1000).forEach(System.out::println);
			
	}

}
