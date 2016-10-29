package com.hackerearth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWithScanner {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("/Users/Amar/Desktop/testfile.rtf"));
			//hasNext() is for word by word 
			while (scanner.hasNext()) {
				String line = scanner.next();
				System.out.println(line);
			}
			//hasNextLine() is for reading the whole line
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
