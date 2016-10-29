package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PrateekAndHisFriends
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++)
		{
			String nx = br.readLine();
			String[] arr = nx.split(" ");
			Long n = Long.parseLong(arr[0]);
			Long x = Long.parseLong(arr[1]);
			Queue<Long> costs = new LinkedList<>();
			Queue<Long> rqueue = new LinkedList<>();
			for (Long j = 0l; j < n; j++)
			{
				costs.add(Long.parseLong(br.readLine()));
			}
			Long sum = 0l;
			boolean isYes = false;
			int size = costs.size();
			for (int j = 0; j < size; j++)
			{
				Long l = costs.poll();
				rqueue.add(l);
				sum = sum + l;
				if (sum == x)
				{
					System.out.println("YES");
					isYes = true;
					break;
				}
				while (sum > x)
				{
					sum = sum - rqueue.poll();
				}
				if (sum == x)
				{
					System.out.println("YES");
					isYes = true;
					break;
				}
			}
			if (!isYes)
				System.out.println("NO");
		}
	}
}
