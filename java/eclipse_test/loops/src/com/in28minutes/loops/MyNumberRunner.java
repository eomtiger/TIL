package com.in28minutes.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(10);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println(sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println(sumOfDivisors);

		number.printANumberTriangle();
	}

}
