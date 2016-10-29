package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class MonkAndTasks2 {
	private static LinkedList<Long> hash[];

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
//		 TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine().trim());
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine().trim());
			hash = new LinkedList[65];
			StringBuilder ans = new StringBuilder();
			s = br.readLine().trim();
			st = new StringTokenizer(s);
			for (int i = 0; i < N; i++) {
				long bin = Long.parseLong(st.nextToken());
				add(bin);
			}
			for (int i = 0; i <= 64; i++) {
				if (hash[i] != null) {
					Iterator<Long> itr = hash[i].iterator();
					while (itr.hasNext())
						ans.append(itr.next() + " ");
				}
			}
			System.out.println(ans);
		}
	}

	private static void add(long bin) {
		// TODO Auto-generated method stub
		int c = 0;
		long num = bin;
		while (num > 0) {
			if ((num & 1) == 1) {
				c++;
			}
			num >>= 1;
		}
		if (hash[c] == null) {
			hash[c] = new LinkedList<>();
		}
		hash[c].add(bin);
	}
}