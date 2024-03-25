import java.util.Scanner;

public class Matrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int matrix1[][] = new int[3][3];
    int matrix2[][] = new int[3][3];
    int result[][] = new int[3][3];

    System.out.println("input matrix 1 continously: ");
    matrix1 = readMatrix(scanner);
    System.out.println("input matrix 2 continously: ");
    matrix2 = readMatrix(scanner);

    System.out.println("Matrix 1:");
    printMatrix(matrix1);
    System.out.println("Matrix 2:");
    printMatrix(matrix2);

    result = addMatrix(matrix1, matrix2);
    System.out.println("Result:");
    printMatrix(result);

    scanner.close();
  }

  private static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(" ");
    }
  }

  private static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
    int result[][] = new int[3][3];

    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1.length; j++) {
        result[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

    return result;
  }

  private static int[][] readMatrix(Scanner scanner) {
    int[][] matrix = new int[3][3];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    return matrix;
  }

}
