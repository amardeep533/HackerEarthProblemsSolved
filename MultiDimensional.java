package com.hackerearth;

import java.io.IOException;
import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[][] = new int[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
