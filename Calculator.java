package com.example.calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");

        // Taking user input for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Taking user input for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Taking user input for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0.0;

        // Performing the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                System.exit(0);
        }

        // Displaying the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
