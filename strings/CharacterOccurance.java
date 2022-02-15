package com.testleaf.strings;

public class CharacterOccurance {
	public static void main(String[] args) {
		String input = "the punishment assigned to a defendant found guilty by a court, or fixed by law for a particular offence";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println(count);

		// String newString = input.replace("e", "");
		// System.out.println(input.length() - newString.length());
	}
}
