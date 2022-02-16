package com.testleaf.strings;

public class ReverseEvenPosition {
	public static void main(String[] args) {
		String input = "My name is Mubasheer";

		String[] split = input.split(" ");

		for (int i = 0; i < split.length; i++) {
			if (i % 2 == 1) {
				for (int j = split[i].length() - 1; j >= 0; j--) {
					System.out.print(split[i].charAt(j));
				}
				System.out.print(" ");
			} else {
				System.out.print(split[i] + " ");
			}
		}
	}
}
