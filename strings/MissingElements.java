package com.testleaf.arrays;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 1, 3, 7, 9 };
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (i + 1 != arr[i]) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
