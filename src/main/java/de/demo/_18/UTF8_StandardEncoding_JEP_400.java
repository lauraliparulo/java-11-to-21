package de.demo._18;

import java.nio.charset.Charset;

public class UTF8_StandardEncoding_JEP_400 {
	
	public static void main(String[] args) {
		
		System.out.println(Charset.defaultCharset());
		
		System.out.println(System.getProperty("native.encoding"));
		
	}

}
