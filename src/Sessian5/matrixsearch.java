package Sessian5;

import java.util.Random;
import java.util.Scanner;

public class matrixsearch {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean found = false;


        // Fill the matrix with random numbers
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(100); // Random numbers between 0 and 99
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter a number to search for: ");
        int searchFor = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchFor) {
                    matrix[i][j] = -10;
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Number not found!");
        }
        System.out.println("Modified matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
