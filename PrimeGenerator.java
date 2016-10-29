package com.hackerearth;

import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		long i = 0;
		long num = 0;
		// Empty String
		String primeNumbers = "";
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();

		while (n > 0) {
			Long n1 = sc.nextLong();
			Long n2 = sc.nextLong();
			long x = 0;
			for (i = n1; i <= n2; i++) {
				int counter = 0;
				for (num = i; num >= 1; num--) {
					if (i % num == 0) {
						counter = counter + 1;
					}
				}
				if (counter == 2) {
					// Appended the Prime number to the String
					primeNumbers = primeNumbers + i + " ";
					System.out.println(i);
				}
			}
			System.out.println("\n");
			n--;
		}
	}

}
