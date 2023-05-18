package P02_Matrix;

import java.util.Scanner;

public class EX_03_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensions = Integer.parseInt(scanner.nextLine());
        int rows = dimensions;
        int cols = dimensions;

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = scanner.nextInt();

            }
        }

        int sumFirstDiagonals = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == c) {
                    int currentDigit = matrix[r][c];
                    sumFirstDiagonals += currentDigit;
                }
            }
        }
        int sumSecondDiagonals = 0;
        for (int r = matrix.length - 1, c = 0; r >= 0 && c < matrix.length; r--, c++) {
            int currentDigit = matrix[r][c];
            sumSecondDiagonals += currentDigit;

        }
        int difference = Math.abs(sumFirstDiagonals - sumSecondDiagonals);
        System.out.println(difference);
    }
}