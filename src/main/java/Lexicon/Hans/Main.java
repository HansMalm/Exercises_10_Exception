package Lexicon.Hans;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

        exercise1ZeroDivision();
        exercise2InputRange();
    }

    //Exercise 1: Ask the user to input two integers then divide and handle division by zero.
    public static void exercise1ZeroDivision() {

    Scanner scanner = new Scanner(System.in);
    try {
    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();
    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();
    System.out.println(firstNumber +"/"+secondNumber +" = "+firstNumber/secondNumber);
    } catch(ArithmeticException e)
    {
        System.out.println("Error: " + e.getMessage());
    }
}

    //Exercise 2: Create a method that reads an integer from the user and checks if it is in range 1 to 100.
    // Handle noninteger input and out of range values.
    public static void exercise2InputRange() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
            while(true) {
                try {
                    System.out.print("Enter a number between 1 and 100: ");
                    inputNumber = scanner.nextInt();

                    if (inputNumber < 1 || inputNumber > 100) {
                        throw new ArithmeticException("Error, Input must be between 1 and 100.");
                    }
                    System.out.println("Input was: " + inputNumber);
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Input was not a number, please try again.");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                scanner.nextLine();
            }
    }
}
