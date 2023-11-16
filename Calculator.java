package Technohack;
//Simple calculator in Java

//Technohacks Edutech internship task#1

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, result = 0;
        int operator = 0;
        Scanner sc = new Scanner(System.in);

        // read first number
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        // read second number
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        // read operator
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter operator: ");
        operator = sc.nextInt();
        sc.close();

        switch (operator) {
            case 1:
                result = num1 + num2;
                System.out.printf("Result is %.2f\n", result);
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("Result is %.2f\n", result);
                break;
            case 3:
                result = num1 * num2;
                System.out.printf("Result is %.2f\n", result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    break;
                }
                result = num1 / num2;
                System.out.printf("Result is %.2f\n", result);
                break;
            default:
                System.out.println("Invalid choice of operator.");
        }
    }

}
