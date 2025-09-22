import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");

        // Ask for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is an adult
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult yet.");
        }

        // Close the scanner
        scanner.close();
    }
}

This is first code

import java.util.Scanner; // Import Scanner class for user input

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Close the scanner
        scanner.close();
    }
}

This file has 2 codes

Here’s a simple Java program to get you started. It demonstrates basic concepts like input, output, and a simple calculation:
Javaimport java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform addition
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

How it works:

The program uses the Scanner class to take input from the user.
It reads two numbers, performs addition, and displays the result.
The scanner.close() ensures the resource is released after use.

Feel free to modify it to include other operations like subtraction, multiplication, or division!

