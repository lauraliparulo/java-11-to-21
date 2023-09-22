package de.demo._17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesMethods {
	
	public static void main(String[] args) throws IOException {
		
		//writeString
		
		Path destinationPath = Paths.get("text.txt");
		
		Files.writeString(destinationPath, "this is the first line");
		Files.writeString(destinationPath, "this is the secodn line", StandardOpenOption.APPEND);
		
		
		// readString
		
		String line1 = Files.readString(destinationPath);
		String line2 =Files.readString(destinationPath);
		System.out.println(line1);
		System.out.println(line2);
		
		// mismatch
	}

}
