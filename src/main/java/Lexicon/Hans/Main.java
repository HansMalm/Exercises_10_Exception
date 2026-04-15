package Lexicon.Hans;

import java.util.Scanner;

public class Main {
    static void main() {
        //Exercise 1: Ask the user to input two integers then divide and handle division by zero.
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        firstNumber = scanner.nextInt();
        while (true) {
            System.out.print("Input second number: ");
            try {
                secondNumber = scanner.nextInt();
                break;
            } catch (ArithmeticException e) {
                System.out.println("Error, divide by zero, please try again.");
            }
        }
        System.out.println(firstNumber + "/" + secondNumber + " = " + firstNumber/secondNumber);
    }
}
