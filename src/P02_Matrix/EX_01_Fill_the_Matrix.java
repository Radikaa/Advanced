package P02_Matrix;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EX_01_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int dimension = Integer.parseInt(input[0]);
        String type = input[1];

        int count = dimension * dimension;
        int row = dimension;
        int column = row;
        int[][] matrix = new int[row][column];

        if (type.equals("A")) {
            typeA(count, matrix);
        } else if (type.equals("B")) {
            typeB(count, matrix);
        }
        output(matrix);
    }

    private static void output(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static void typeB(int count, int[][] matrix) {
        for (int c = matrix.length - 1; c >= 0; c--) {
            if (c % 2 == 0) {
                for (int r = matrix.length - 1; r >= 0; r--, count--) {
                    matrix[r][c] = count;
                }
            } else {
                for (int r = 0; r <= matrix.length - 1; r++, count--) {
                    matrix[r][c] = count;
                }

            }
        }
    }

    private static void typeA(int count, int[][] matrix) {
        for (int c = matrix.length - 1; c >= 0; c--) {
            for (int r = matrix.length - 1; r >= 0; r--, count--) {
                matrix[r][c] = count;
            }
        }
    }
}