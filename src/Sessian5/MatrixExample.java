package Sessian5;

public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 5, 4},
                {9, 3, 5},
                {3, 7, 5}
        };
        int[][] matrix2 = {
                {2, 9, 3},
                {5, 3, 7},
                {4, 5, 5}
        };
        printMatrix(matrix , matrix2);
    }
        public static void printMatrix(int[][] matrix, int[][] matrix2) {
            System.out.println("Matrix 1:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Matrix 2:");
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
    }
//    public static void printMatrix(int[][] matrix) {
//        for (int[] )row : matrix) {
//            for (int number : row) {
//                System.out.print(number + " ");
//            }
//            System.out.println();
//
//        }
//    }
    public static void calculateMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.print(sum);
    }
    public static void calculateRowSums(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }
    public static void rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

