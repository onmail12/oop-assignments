package com.tugas2;

import java.util.Scanner;

public class Matrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter amount of row for both matrix: ");
    int rowAmount = scanner.nextInt();
    System.out.print("Enter amount of column for both matrix: ");
    int colAmount = scanner.nextInt();

    int matrix1[][] = new int[rowAmount][colAmount];
    int matrix2[][] = new int[rowAmount][colAmount];
    int result[][] = new int[rowAmount][colAmount];

    System.out.println("input matrix 1 continously: ");
    matrix1 = inputMatrix(scanner, rowAmount, colAmount);
    System.out.println("input matrix 2 continously: ");
    matrix2 = inputMatrix(scanner, rowAmount, colAmount);

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
    System.out.println();
  }

  private static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
    int result[][] = new int[matrix1.length][matrix1[0].length];

    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1.length; j++) {
        result[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

    return result;
  }

  private static int[][] inputMatrix(Scanner scanner, int rowAmount, int colAmount) {
    int[][] matrix = new int[rowAmount][colAmount];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    return matrix;
  }
}
