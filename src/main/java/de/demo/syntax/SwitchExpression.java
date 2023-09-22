package de.demo.syntax;

import java.time.DayOfWeek;

public class SwitchExpression {

	public static void main(String[] args) {

		DayOfWeek day = DayOfWeek.FRIDAY;

		int numOfLetters = switch (day) {
		case null -> 0;
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;

		};

		System.out.println(numOfLetters);

		day = DayOfWeek.SUNDAY;

		// switch mit clause and return with yield
		int numOfLetters2 = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> {
			if (day == DayOfWeek.SUNDAY)
				System.out.println("Sunday is the best day");
			yield 6;
		}
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;

		};

		// null??

		System.out.println(numOfLetters2);
	}

}
