package com.hackerearth;

import java.util.Scanner;

public class HackerEarthPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean palindrome = true;
		for(int i = 0; i < (input.length() / 2); i++)
		{
		    if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
		        palindrome = false;
		        break;
		    }
		}
		if (palindrome) {
		     System.out.println("YES");
		} else {
		    System.out.println("NO");
		}
		sc.close();
	}
}
