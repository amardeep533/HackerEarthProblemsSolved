package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MishkiPlayingGames
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] s1 = line.split(" ");
		int days = Integer.parseInt(s1[1]);
		String line1 = br.readLine();
		String[] s2 = line1.split(" ");
		List<Long> sets = new ArrayList<Long>();
		for (int i = 0; i < s2.length; i++)
		{
			sets.add(Long.parseLong(s2[i]));
		}

		for (int i = 0; i < days; i++)
		{
			int count = 0;
			List<Long> newSets = new ArrayList<Long>();
			newSets.addAll(sets);
			String line3 = br.readLine();
			String[] s3 = line3.split(" ");
			int start = Integer.parseInt(s3[0]);
			int end = Integer.parseInt(s3[1]);
			for (int j = start - 1; j < end - 1; j++)
			{
				Long temp = newSets.get(j);
				while (temp != 0)
				{
					temp = temp / 2;
					count++;
				}
			}
			if (count % 2 == 0)
			{
				System.out.println("Hacker");
			}
			else
			{
				System.out.println("Mishki");
			}
		}
	}
}
