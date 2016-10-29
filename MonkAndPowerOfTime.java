package com.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class MonkAndPowerOfTime {

	public static String[] swap(int index1, int index2, String wrongArr[]) {
		String temp = "";
		temp = wrongArr[index1];
		wrongArr[index1] = wrongArr[index2];
		wrongArr[index2] = temp;
		return wrongArr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.nextLine());
		String wrong = sc.nextLine();
		String[] wrongArr = wrong.split(" ");
		int size = wrongArr.length;
		String correct = sc.nextLine();
		String[] correctArr = correct.split(" ");
		int count = 0;
		for (int j = 0; j < size; j++) {
			if (!correctArr[j].equals(wrongArr[j])) {
				int index = Arrays.asList(wrongArr).indexOf(correctArr[j]);
				wrongArr = swap(j, index, wrongArr);
				count++;
			}
		}
		count = count + size;
		System.out.println(count);
		sc.close();
	}
}
