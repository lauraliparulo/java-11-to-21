package de.demo._17;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatEx {
	
	public static void main(String[] args) {
		
		var compactFormatLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		
		System.out.println(compactFormatLong.format(1_000_000));
	}

}
