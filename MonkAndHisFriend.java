package com.hackerearth;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonkAndHisFriend {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String numberOfTestCases = sc.nextLine();
		List<TestCases> testList = new ArrayList<>();
		BigInteger n = new BigInteger(numberOfTestCases);
		for (BigInteger i = BigInteger.valueOf(1); i.compareTo(n) <= 0; i = i.add(BigInteger.valueOf(1))) {
			TestCases t = new TestCases();
			String input = sc.nextLine();
			String[] arr = input.split(" ");
			t.input1 = new BigInteger(arr[0]);
			t.input2 = new BigInteger(arr[1]);
			testList.add(t);
		}
		for (TestCases test : testList) {
			BigInteger input1 = test.input1;
			BigInteger input2 = test.input2;
			BigInteger result = input1.xor(input2);
			System.out.println(result.bitCount());
		}
		sc.close();
	}
}

class TestCases {
	public BigInteger input1;
	public BigInteger input2;
}
