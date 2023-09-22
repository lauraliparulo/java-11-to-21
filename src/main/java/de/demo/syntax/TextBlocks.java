package de.demo.syntax;

public class TextBlocks {

	public static void main(String[] args) {

		var textblock = """
				hello, laura
				this is a text block
				"double quotes"
				\""" triple quotes \"""
				see you!
				""";

		var textblockEscaped = """
				hello, laura! \
				this is a text block \
				to learn the escaped \
				variation. \
				see you!
				""";
		
		var textblockWithPlaceHolders = """
				hello, laura! \
				I have bought %d pizzas for tonight! \
				%d beers are already in the fridge. \
				Please invite %s
				see you!
				""".formatted(10,50,"Mike");
		
		var javascriptBlock = """
				function hello() {
				print("hello world!");
				}
				hello();  
				""";
		
		System.out.println(textblock);
		System.out.println(textblockEscaped);
		System.out.println(textblockWithPlaceHolders);
		System.out.println(javascriptBlock);
	}

}
