package com.hackerearth;

import java.util.Scanner;

public class TowerArrange
{
	public int[] mergeSort(String[] arr){
		int intArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		
		
		
		
		return intArr;
	}
	
	
	public int[] selectionSort(String[] arr)
	{
		int intArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			intArr[i] = Integer.parseInt(arr[i]);
		}
		for (int i = 0; i < intArr.length - 1; i++)
		{
			int small = intArr[i];
			int position2 = i;
			for (int j = i; j < intArr.length; j++)
			{
				if (small < intArr[j])
				{
					small = intArr[j];
					position2 = j;
				}
			}
			intArr = swap(intArr, i, position2);
		}
		for (int i : intArr)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		return intArr;
	}

	public int[] insertionSort(String[] arr)
	{
		int intArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			intArr[i] = Integer.parseInt(arr[i]);
		}
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (intArr[i] < intArr[i + 1])
			{
				intArr = swap(intArr, i, i + 1);
			}
			int j = i;
			while (j - 1 >= 0)
			{
				if (intArr[j] > intArr[j - 1])
				{
					intArr = swap(intArr, j, j - 1);
				}
				j--;
			}
		}
		for (int i : intArr)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		return intArr;
	}

	public int[] bubbleSort(String[] arr)
	{
		// Bubble sort for descending order
		int[] intArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			intArr[i] = Integer.parseInt(arr[i]);
		}
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < intArr.length - i - 1; j++)
			{
				if (intArr[j] < intArr[j + 1])
				{
					intArr = swap(intArr, j, j + 1);
				}
			}
		}
		for (int i : intArr)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		return intArr;
	}

	public int[] swap(int[] arr, int position1, int position2)
	{
		int temp = 0;
		temp = arr[position1];
		arr[position1] = arr[position2];
		arr[position2] = temp;
		return arr;
	}

	public static void main(String[] args)
	{
		// Input sample
		// 1
		// 5
		// 2 5 2 4 3
		Scanner s = new Scanner(System.in);
		String noOfTestCases = s.nextLine();
		int N = Integer.parseInt(noOfTestCases);
		for (int i = 0; i < N; i++)
		{
			String sizeString = s.nextLine();
			int size = Integer.parseInt(sizeString);
			String numbers = s.nextLine();
			String[] stringArr = numbers.split(" ");
			TowerArrange arrange = new TowerArrange();

			// arrange.bubbleSort(stringArr);
			// arrange.insertionSort(stringArr);
			arrange.selectionSort(stringArr);
			System.out.println();
		}
		s.close();
	}
}
