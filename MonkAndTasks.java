package com.hackerearth;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MonkAndTasks {

	public static StringBuilder printResultForTestCase(TestCase testCase) {
		List<Input> inputs = new ArrayList<>();
		inputs = testCase.getInputs();
		Collections.sort(inputs);
		StringBuilder sb = new StringBuilder();
		for (Input input : inputs) {
			sb.append(input.getInput() + " ");
		}
		sb.append(System.getProperty("line.separator"));
		return sb;
	}

	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();

		String path = "/Users/Amar/Desktop/monkinput.txt";
		Scanner sc = new Scanner(new File(path));
		//Scanner sc = new Scanner(System.in);
		String numberOfTestCases = sc.nextLine();
		BigInteger numberOfTest = new BigInteger(numberOfTestCases);
		List<TestCase> testcases = new ArrayList<>();
		for (BigInteger i = BigInteger.valueOf(1); i.compareTo(numberOfTest) <= 0; i = i.add(BigInteger.valueOf(1))) {
			// int noOfDays = Integer.parseInt(sc.nextLine());
			BigInteger noOfDays = BigInteger.valueOf(sc.nextInt());
			String taskString = sc.nextLine();
			String[] tasks = taskString.split(" ");
			int dayNumber = 0;
			TestCase testCase = new TestCase();
			List<Input> inputs = new ArrayList<>();
			testCase.testCaseNo = i;
			// for (int j = 0; j < tasks.length; j++) {
			// String string = tasks[j];
			for (BigInteger j = BigInteger.valueOf(0); j.compareTo(noOfDays) < 0; j = j.add(BigInteger.valueOf(1))) {
				BigInteger integer = BigInteger.valueOf(sc.nextInt());
				Input input = new Input();
				input.dayNumber = dayNumber++;
				input.number = integer;
				input.bitCount = integer.bitCount();
				inputs.add(input);
			}
			testCase.setInputs(inputs);
			testcases.add(testCase);
		}
		StringBuilder sb = new StringBuilder();
		for (TestCase testCase1 : testcases) {
			sb.append(printResultForTestCase(testCase1));
		}
		//System.out.println(sb);
		sc.close();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time" + totalTime);
	}
}

class TestCase {
	BigInteger testCaseNo;
	public List<Input> inputs;

	public BigInteger getTestCaseNo() {
		return testCaseNo;
	}

	public List<Input> getInputs() {
		return inputs;
	}

	public void setInputs(List<Input> inputs) {
		this.inputs = inputs;
	}

	public void setTestCaseNo(BigInteger testCaseNo) {
		this.testCaseNo = testCaseNo;
	}
}

class Input implements Comparable<Input> {
	int dayNumber;
	BigInteger number;
	int bitCount;

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public void setInput(BigInteger input) {
		this.number = input;
	}

	public void setBitCount(int bitCount) {
		this.bitCount = bitCount;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public BigInteger getInput() {
		return number;
	}

	public int getBitCount() {
		return bitCount;
	}

	@Override
	public int compareTo(Input o) {
		if (this.getBitCount() > o.getBitCount())
			return 1;
		else if (this.getBitCount() < o.getBitCount())
			return -1;
		else
			return 0;
	}
}