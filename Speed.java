package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Speed {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		for (int i = 0; i < N; i++) {
			Queue<Long> carQu = new LinkedList<Long>();
			int queSize = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String[] arr = str.split(" ");
			for (int j = 0; j < queSize; j++) {
				carQu.add(Long.parseLong(arr[j]));
			}
			Long previousCar = carQu.peek();
			Long count = 0l;
			for (Long currentCar : carQu) {
				if (currentCar.compareTo(previousCar) <= 0l) {
					count++;
					previousCar = currentCar;
				}
			}
			System.out.println(count);
		}
	}
}