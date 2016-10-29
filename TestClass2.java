package com.hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass2 {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */
		int a = 97;
		int z = 122;
		int A = 65;
		int Z = 90;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		char[] characters = line.toCharArray();
		for (char c : characters) {

			if ((int) c >= a && (int) c <= z) {
				System.out.print(Character.toUpperCase(c));
			}

			if ((int) c >= A && (int) c <= Z) {
				System.out.print(Character.toLowerCase(c));
			}
		}
	}
}
