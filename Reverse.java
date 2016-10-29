package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int j = 0; j < n; j++) {
			String line = br.readLine();
			StringBuilder str = new StringBuilder("");
			for (int i = line.length()-1; i >= 0; i--) {
				str.append(line.charAt(i));
			}
			System.out.println(str);
		}
	}
}
