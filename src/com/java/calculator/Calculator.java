package com.java.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char operation;
		double num1, num2;

		while (true) {
			System.out.println();
			System.out.println("Choose an operation:");
			System.out.println("+ : Addition");
			System.out.println("- : Subtraction");
			System.out.println("* : Multiplication");
			System.out.println("/ : Division");
			System.out.println("q : Quit");

			operation = scanner.next().charAt(0);

			// Quit operatons
			if (operation == 'q') {
				break;
			}

			// Validate the operation
			if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
				System.out.println("Invalid operation. Please try again.");
				continue;
			}

			// Read the first number
			System.out.print("Enter first number: ");
			// check invalid input
			if (!scanner.hasNextDouble()) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next();
				continue;
			}
			num1 = scanner.nextDouble();

			// Read the second number
			System.out.print("Enter second number: ");
			// check invalid input
			if (!scanner.hasNextDouble()) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next();
				continue;
			}
			num2 = scanner.nextDouble();

			// Switch statement perform the selected operations
			switch (operation) {
			case '+':
				System.out.println("Result: " + add(num1, num2));
				break;
			case '-':
				System.out.println("Result: " + subtract(num1, num2));
				break;
			case '*':
				System.out.println("Result: " + multiply(num1, num2));
				break;
			case '/':
				if (num2 == 0) {
					System.out.println("Error: Division by zero.");
				} else {
					System.out.println("Result: " + divide(num1, num2));
				}
				break;
			}
		}

		// End program
		scanner.close();
		System.out.println("Calculator program ended.");
	}

	// Methods for each arithmetic operations & add two numbers
	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
}