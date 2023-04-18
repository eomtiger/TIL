package com.in28minutes.ifstatement.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuRunner {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter Number1: ");
//		int number1 = scanner.nextInt();
//		System.out.println("The number you entered is = " + number1);
//
//		System.out.println("Enter Number2: ");
//		int number2 = scanner.nextInt();
//		System.out.println("The number you entered is = " + number2);
//
//		System.out.println("1 - Add");
//		System.out.println("2 - Substract");
//		System.out.println("3 - Divide");
//		System.out.println("4 - Multiply");
//
//		int chooseNum = scanner.nextInt();
//		System.out.println("Choose Operation: " + chooseNum);
//
//	

//		System.out.println(isWeekday());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int monthNumber = Integer.parseInt(br.readLine());

		System.out.println(determineNameOfMonth(monthNumber));

	}

	private static String determineNameOfMonth(int monthNumber) {
		String month = "";
		switch (monthNumber) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "Febuary";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "Sep";
			break;
		case 10:
			month = "Oct";
			break;
		case 11:
			month = "Nov";
			break;
		case 12:
			month = "Dec";
			break;
		}

		return month;

	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int chooseNum) {
		if (chooseNum == 1) {
			System.out.println("Result is " + (number1 + number2));
		} else if (chooseNum == 2) {
			System.out.println("Result is " + (number1 - number2));
		} else if (chooseNum == 3) {
			System.out.println("Result is " + (number1 / number2));
		} else if (chooseNum == 4) {
			System.out.println("Result is " + (number1 * number2));
		}
	}

	private static void performOperationUsingSwitch(int number1, int number2, int chooseNum) {

		switch (chooseNum) {
		case 1:
			System.out.println("Result is " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result is " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result is " + (number1 / number2));
			break;
		default:
			System.out.println("Result is " + (number1 * number2));
		}
	}

	public static boolean isWeekday() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());

		switch (i) {
		case 0:
			System.out.println("Sunday");
			return false;
		case 1:
			System.out.println("Monday");
			return true;
		case 2:
			System.out.println("Tuesday");
			return true;
		case 3:
			System.out.println("Wednesday");
			return true;
		case 4:
			System.out.println("Thursday");
			return true;
		case 5:
			System.out.println("Friday");
			return true;
		default:
			System.out.println("Saturday");
			return false;
		}
	}

//	public static String

}
