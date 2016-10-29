package com.hackerearth;

import java.util.Scanner;

public class FacebookPhotoUpload {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int noOfPics = sc.nextInt();
		int w = 0;
		int h = 0;
		for (int i = 0; i < noOfPics; i++) {
			w = sc.nextInt();
			h = sc.nextInt();
			if (w < length || h < length) {
				System.out.println("UPLOAD ANOTHER");
			} else if (w == length && h == length) {
				System.out.println("ACCEPTED");
			} else {
				System.out.println("CROP IT");
			}
		}
		sc.close();
	}
}
