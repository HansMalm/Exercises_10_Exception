package Lexicon.Hans;

import java.util.InputMismatchException;
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

        //Exercise 2: Runtime, see method code below.
        inputRange();
    }

    //Exercise 2: Create a method that reads an integer from the user and checks if it is in range 1 to 100.
    // Handle noninteger input and out of range values.
    public static void inputRange() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
            while(true) {
                try {
                    System.out.print("Enter a number between 1 and 100: ");
                    inputNumber = scanner.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Input was not a number, please try again.");
                }
            }
            if (inputNumber < 1 || inputNumber > 100) {
                throw new IllegalArgumentException("Error, Input must be between 1 and 100.");
            }
            else {
                System.out.println("Input was: " + inputNumber);
            }
    }
}
