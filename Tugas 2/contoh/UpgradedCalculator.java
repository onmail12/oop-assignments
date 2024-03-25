import java.util.Scanner;

public class UpgradedCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int operation = scanner.nextInt();
    double number;


    while (operation > 0 && operation < 5) {
      number = readNumber(scanner);
      showMenu();
      operation = scanner.nextInt();

      switch (operation) {
        case value:
          
          break;
      
        default:
          break;
      }
    }

    scanner.close();
  }

  private static void showMenu() {
    System.out.println("Choose the operation:");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    System.out.print("Your choice: ");
  }

  private static double readNumber(Scanner scanner) {
    System.out.print("Enter a number: ");
    return scanner.nextDouble();
  }
}
