package de.demo._17;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		// is blank

		String text1 = "";
		String text2 = " ";
		String text3 = "\n \t";

		System.out.println(text1.isBlank());
		System.out.println(text2.isBlank());
		System.out.println(text3.isBlank());

		System.out.println(text1.isEmpty());
		System.out.println(text2.isEmpty());
		System.out.println(text3.isEmpty());

		// lines
		String textlines = """
				1dfdf
				2dfdf
				  	3dffd
				""";
		textlines.lines().forEach(System.out::println);

		// repeat
		String star = "*";
		System.out.println(star.repeat(30));

		// indent
		var text4 = "Test".indent(4);
		System.out.println(text4);

		var text5 = "This is text to transform!";
		var result = text5.transform(String::toUpperCase).transform(str -> str.replace("T", "S"))
				.transform(str -> str.split(" "));

		System.out.println(Arrays.toString(result));

		// formatted

		var msg = "%d %s";

		System.out.println(msg.formatted(7, "is the magic number"));

	}

}
