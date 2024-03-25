package com.tugas2;
import java.util.Scanner;

public class UpgradedCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double result = readNumber(scanner);

    while (true) {
      showMenu();
      int operation = scanner.nextInt();
      double secondNumber;
      switch (operation) {
        case 1:
          secondNumber = readNumber(scanner);
          result = add(result, secondNumber);
          break;
        case 2:
          secondNumber = readNumber(scanner);
          result = subtract(result, secondNumber);
          break;
        case 3:
          secondNumber = readNumber(scanner);
          result = multiply(result, secondNumber);
          break;
        case 4:
          secondNumber = readNumber(scanner);
          result = divide(result, secondNumber);
          break;
        default:
          return;
      }
      System.out.println("Current Total: " + result);
    }
  }

  private static void showMenu() {
    System.out.println("Choose the operation:");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.print("Your choice (input anything else to stop the program): ");
  }

  private static double readNumber(Scanner scanner) {
    System.out.print("Enter a number: ");
    return scanner.nextDouble();
  }

  private static double add(double firstNumber, double secondNumber) {
    return firstNumber + secondNumber;
  }

  private static double subtract(double firstNumber, double secondNumber) {
    return firstNumber - secondNumber;
  }

  private static double multiply(double firstNumber, double secondNumber) {
    return firstNumber * secondNumber;
  }

  private static double divide(double firstNumber, double secondNumber) {
    if (secondNumber != 0) {
      return firstNumber / secondNumber;
    } else {
      System.out.println(firstNumber + " Cannot be divided by zero");
      return firstNumber;
    }
  }

}