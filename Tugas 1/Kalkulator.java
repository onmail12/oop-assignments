import java.util.Scanner;

public class Kalkulator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Input two integers:");

    System.out.print("First number:");
    double firstNumber = input.nextDouble();

    System.out.print("Second number:");
    double secondNumber = input.nextDouble();

    System.out.println("Choose the operation:");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.print("Your choice: ");
    int operation = input.nextInt();
    input.close();

    switch (operation) {
      case 1:
        System.out.println(
            "The result of adding " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber));
        break;
      case 2:
        System.out.println(
            "The result of subtracting " + firstNumber + " and " + secondNumber + " is "
                + (firstNumber - secondNumber));
        break;
      case 3:
        System.out.println("The result of multiplying " + firstNumber + " and " + secondNumber + " is "
            + (firstNumber * secondNumber));
        break;
      case 4:
        System.out.println("The result of dividing " + firstNumber + " and " + secondNumber + " is "
            + (firstNumber / secondNumber));
        break;
      default:
        System.out.println("Invalid Choice");
        break;
    }

  }
}
