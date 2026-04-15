package Lexicon.Hans;

import java.util.Scanner;

public class Main {
    static void main() {
        //Exercise 1: Ask the user to input two integers then divide and handle division by zero.
        int firstNumber, secondNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
            try {
                secondNumber = scanner.nextInt();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        System.out.println(firstNumber + "/" + secondNumber + " = " + firstNumber/secondNumber);
    }
}
