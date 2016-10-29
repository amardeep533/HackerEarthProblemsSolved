package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OutputClass
{
	static int gcd(int x, int y)
	{
		int r = 0, a, b;
		a = (x > y) ? x : y; // a is greater number
		b = (x < y) ? x : y; // b is smaller number

		r = b;
		while (a % b != 0)
		{
			r = a % b;
			a = b;
			b = r;
		}
		return r;
	}

	public static int getNoOfPairs(int input)
	{
		int noOfPairs = 0;
		for (int i = 1; i <= input; i++)
		{
			for (int j = 1; j <= input; j++)
			{
				if (i * j == input && gcd(i, j) == 1)
				{
					noOfPairs++;
				}
			}
		}
		return noOfPairs;
	}

	public static void main(String[] args) throws IOException
	{
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// String line = br.readLine();
		// int N = Integer.parseInt(line);
		// for (int i = 0; i < N; i++)
		// {
		// String input = br.readLine();
		// int testValue = Integer.parseInt(input);
		// int count = 0;
		// for (int j = 1; j <= testValue; j++)
		// {
		// if (testValue % j == 0 && gcd(j, testValue/j) == 1)
		// {
		// count++;
		// }
		// }
		// System.out.println(count);
		// }
		List<Integer> sums = new ArrayList<>();
		int[] arr = { 6, 4, 3 };
		for (int i = 0; i < arr.length; i++)
		{
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++)
			{
				sum = sum + arr[j];
				sums.add(sum);
			}
		}
		for (Integer i : sums)
		{
			System.out.println(i);
		}
	}
}