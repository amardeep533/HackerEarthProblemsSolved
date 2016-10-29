package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BiasedChandan {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arrSize = br.readLine();
		int size = Integer.parseInt(arrSize);
		Queue<Long> que = new LinkedList<>();
		Stack<Long> stk = new Stack<>();
		for (int i = 0; i < size; i++) {
			Long x = Long.parseLong(br.readLine());
			que.add(x);
		}
		Long sumQ = 0l;
		for (Long mark : que) {
			if (mark != 0) {
				stk.push(mark);
			} else {
				stk.pop();
			}
		}
		for (Long mark : stk)
			sumQ = sumQ + mark;
	}
}
