package com.hackerearth;

import java.util.Scanner;

public class TestClass1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(sc.nextInt() - 1);
		}
		sc.close();
	}
}
