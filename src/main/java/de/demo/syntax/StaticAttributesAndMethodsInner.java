package de.demo.syntax;

public class StaticAttributesAndMethodsInner {
	
	class InnerClass {
		static final String MESSAGE="this is a static attribute from java 16";
		
		static String getText() {
			return MESSAGE;
		}
		
	}

}
