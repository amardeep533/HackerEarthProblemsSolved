package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsicutiveStrings
{

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++)
		{
			String str = br.readLine();
			Character[] ch = new Character[str.length()];
			ch[0] = str.charAt(0);
			StringBuilder stbld = new StringBuilder();
			stbld.append(ch[0]);
			for (int j = 1; j < str.length(); j++)
			{
				ch[j] = str.charAt(j);
				if (ch[j - 1] != str.charAt(j))
				{
					stbld.append(str.charAt(j));
				}
			}
			System.out.println(stbld);
		}
	}
}
