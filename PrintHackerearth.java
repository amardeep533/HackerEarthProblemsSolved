package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrintHackerearth
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		Long N = Long.parseLong(line);
		String str = br.readLine();
		String[] arr = str.split("");
		Long h = 0l; // 2
		Long a = 0l; // 2
		Long c = 0l;
		Long k = 0l;
		Long e = 0l; // 2
		Long r = 0l; // 2
		Long t = 0l;

		for (int j = 0; j < arr.length; j++)
		{
			switch (arr[j])
			{
			case "h":
				h++;
				break;

			case "a":
				a++;
				break;

			case "c":
				c++;
				break;

			case "k":
				k++;
				break;

			case "e":
				e++;
				break;

			case "r":
				r++;
				break;

			case "t":
				t++;
				break;

			default:
				break;
			}
		}
		h = h / 2l;
		a = a / 2l;
		e = e / 2l;
		r = r / 2l;
		List<Long> lis = new ArrayList<>();
		lis.add(h);
		lis.add(a);
		lis.add(c);
		lis.add(k);
		lis.add(e);
		lis.add(r);
		lis.add(t);
		Long smallest = h;
		for (Long long1 : lis)
		{
			if (smallest > long1)
			{
				smallest = long1;
			}
		}
		System.out.println(smallest);
	}
}
