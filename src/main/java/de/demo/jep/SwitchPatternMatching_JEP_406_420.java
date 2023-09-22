package de.demo.jep;

public class SwitchPatternMatching_JEP_406_420 {


	public static void main(String[] args) {
		switchObj("hello");
	}

	public static void switchObj(Object obj) {
		
		switch(obj) {
		case null -> System.out.println("Null!");
		case Integer intValue -> System.out.printf("integer %d \n", intValue);
		case String str when str.length() > 5 -> System.out.printf("Short string: '%s'",str);
		default -> System.out.println(obj);
		}
		
		
	}
}
