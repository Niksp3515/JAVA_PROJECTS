package com.module_1;

import java.util.ArrayList;

public class Prac_13 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				arr.add(i);
			}
			if (i % 5 == 0) {
				arr.add(i);
			}
			if ((i % 3 == 0) && (i % 5 == 0)) {
				arr.add(i);
			}
		}
		System.out.println(arr);
	}
}
