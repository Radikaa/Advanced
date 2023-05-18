package P02_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_05_Maximum_Sum_of_2X2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int column = dimensions[1];
        int[][] matrix = new int[row][column];
        StringBuilder output = new StringBuilder();

        for (int r = 0; r < row; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int sum = Integer.MIN_VALUE;

        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {
                int currentSum = matrix[r][c] + matrix[r][c + 1] + matrix[r + 1][c] + matrix[r + 1][c + 1];
                if (currentSum > sum) {
                    sum = currentSum;
                    output.setLength(0);
                    output.append(matrix[r][c] + " " + matrix[r][c + 1] + System.lineSeparator() + matrix[r + 1][c] + " " + matrix[r + 1][c + 1]);
                }
            }
        }
        System.out.println(output);
        System.out.println(sum);
    }
}