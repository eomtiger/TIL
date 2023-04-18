package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}

		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if ((ch <= 122 && ch >= 97) || (ch <= 90 && ch >= 65)) {
			return true;
		}
		return false;
	}

	public void isConsonant() {
		if (!isVowel() && isAlphabet()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void printLowerCaseAlphabets() {
		for (int i = 97; i <= 122; ++i) {
			char ch = (char) i;
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
