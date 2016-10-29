package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ModifySequence {
	public static void main(String[] args) throws NumberFormatException, IOException {
		long startTime = System.nanoTime();
		// code

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arrSize = br.readLine();
		int size = Integer.parseInt(arrSize);
		String numbers = br.readLine();
		String[] numArr = numbers.split(" ");
		Queue<Long> que = new LinkedList<>();
		for (int i = 0; i < numArr.length; i++) {
			que.add(Long.parseLong(numArr[i]));
		}
		Long x = que.poll();
		for (Long num : que) {
			x = num - x;
		}
		if (x == 0l) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
	}
}
