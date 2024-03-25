import java.util.Scanner;

public class Volume {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Choose one of 3 dimensional shape below:");
    System.out.println("1. Cube");
    System.out.println("2. Rectangular Cube");
    System.out.println("3. Cylinder");
    System.out.print("Your choice: ");
    int operation = input.nextInt();

    System.out.println("Select the length units:");
    System.out.println("1. Milimeter");
    System.out.println("2. Centimeter");
    System.out.println("3. Meter");
    System.out.print("Your choice: ");
    int lengthUnitChoice = input.nextInt();
    String lengthUnit = "";

    switch (lengthUnitChoice) {
      case 1:
        lengthUnit = "mm";
        break;

      case 2:
        lengthUnit = "cm";
        break;
      case 3:
        lengthUnit = "m";
        break;
      default:
        System.out.println("Invalid Choice");
        break;
    }

    switch (operation) {
      case 1:
        System.out.print("Enter side length: ");
        double side = input.nextDouble();
        System.out.println("The volume of the cube is " + (side * side * side) + " " + lengthUnit);
        break;
      case 2:
        System.out.print("Enter the length: ");
        double length = input.nextDouble();
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        System.out.println("The volume of the rectangular cube is " + (length * width * height) + " " + lengthUnit);
        break;
      case 3:
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height: ");
        height = input.nextDouble();
        System.out
            .println("The volume of the cylinder is " + (3.14f * radius * radius * height) + " " + lengthUnit);
        break;
      default:
        System.out.println("Invalid Choice");
        break;
    }
    input.close();
  }

}
