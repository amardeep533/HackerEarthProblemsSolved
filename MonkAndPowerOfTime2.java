package com.hackerearth;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class MonkAndPowerOfTime2 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String s1 = br.readLine();
		String s2 = br.readLine();
		String p[] = s1.split(" ");
		String q[] = s2.split(" ");
		Queue<String> qe = new LinkedList<String>();
		for (int i = 0; i < q.length; i++)
			qe.add(p[i]);
		int j = 0, k = 0;
		while (!qe.isEmpty()) {
			if (qe.peek().equals(q[j])) {
				qe.poll();
				j++;
				k++;
			} else {
				String b = qe.peek();
				qe.poll();
				qe.add(b);
				k++;
			}
		}
		System.out.println(k);
	}
}