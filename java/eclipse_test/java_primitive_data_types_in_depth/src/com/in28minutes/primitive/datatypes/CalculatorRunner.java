package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class CalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500", "7.5");
		BigDecimal totalValue = calculator.calculateToValue(5);
		System.out.println(totalValue);
	}

}
