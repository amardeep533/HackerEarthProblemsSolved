package com.hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonkAndColleagues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = Integer.parseInt(sc.nextLine());
		Map<Integer, String> colleagues = new HashMap<>();
		for (int i = 0; i < q; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			colleagues.put(Integer.parseInt(arr[0]), arr[1]);
		}
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Integer rollNo = Integer.parseInt(sc.nextLine());
			System.out.println(colleagues.get(rollNo));
		}
		sc.close();
	}
}
