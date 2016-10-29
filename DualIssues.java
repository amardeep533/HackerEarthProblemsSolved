package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DualIssues {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		Long n = Long.parseLong(line);
		for (long i = 0; i < n; i++) {
			String size = br.readLine();
			int arrSize = Integer.parseInt(size);
			BigInteger max = new BigInteger("0");
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arrSize; j++) {
				BigInteger b = new BigInteger(st.nextToken());
				if (b.isProbablePrime(1) && max.compareTo(b) < 0) {
					max = b;
				}
			}
			if (max.equals(BigInteger.ZERO)) {
				System.out.println();
				System.out.println(-1);
			} else {
				System.out.println(max.multiply(max));
			}
		}
	}
}
