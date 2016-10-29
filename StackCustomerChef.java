package com.hackerearth;

import java.util.Scanner;
import java.util.Stack;

public class StackCustomerChef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = Integer.parseInt(sc.nextLine());
		Stack<Integer> integers = new Stack<>();
		for (int i = 0; i < q; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			if (Integer.parseInt(arr[0]) == 1) {
				if (integers.size() == 0) {
					System.out.println("No Food");
				} else if (integers.size() > 0) {
					System.out.println(integers.pop());
				}
			} else if (Integer.parseInt(arr[0]) == 2) {
				integers.push(Integer.parseInt(arr[1]));
			}
		}
		sc.close();
	}
}
