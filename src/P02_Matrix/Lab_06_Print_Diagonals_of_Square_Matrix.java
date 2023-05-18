package P02_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_06_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensions = Integer.parseInt(scanner.nextLine());
        int row = dimensions;
        int column = dimensions;

        int[][] matrix = new int[row][column];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        row = 0;
        column = 0;
        while (row < matrix.length && column < matrix[row].length) {
            System.out.print(matrix[row][column] + " ");
            row++;
            column++;
        }
        System.out.println();

        row = matrix.length - 1;
        column = 0;
        while (row >= 0 && column < matrix[row].length) {
            System.out.print(matrix[row][column] + " ");
            row--;
            column++;
        }

    }
}
