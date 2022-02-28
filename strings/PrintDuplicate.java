package com.testleaf.arrays;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 14, 15, 11, 12, 14, 16, 17, 19, 20 };
		for (int i = 0; i < arr.length; i++) {
			// int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					// count++;
					System.out.println(arr[i]);
				}
			}
			// if (count > 1) {
			// System.out.println(arr[i]);
			// }
		}
	}
}
