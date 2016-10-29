package com.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
	public int noOfSetBits(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberOfTestCases = sc.nextLine();
		List<String> values = new ArrayList<String>();
		for (int i = 0; i < Integer.parseInt(numberOfTestCases); i++) {
			String s = sc.nextLine();
			values.add(Integer.toBinaryString(Integer.parseInt(s)));
		}
		TestClass t = new TestClass();
		for (String binaryString : values) {
			System.out.println(t.noOfSetBits(binaryString));
		}
		sc.close();
	}
}
