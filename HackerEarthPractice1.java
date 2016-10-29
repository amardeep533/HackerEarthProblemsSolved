package com.hackerearth;

import java.util.Scanner;

public class HackerEarthPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		while (input != 42) {
			System.out.println(input);
			input = Integer.parseInt(sc.nextLine());
			if(input==42)
				break;
		}
		sc.close();
	}
}
