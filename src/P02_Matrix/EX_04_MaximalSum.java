package P02_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class EX_04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int col = dimensions[1];
        int[][] matrix = new int[row][col];

        for (int r = 0; r < matrix.length; r++) {
            String[] input = scanner.nextLine().split(" ");
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = Integer.parseInt(input[c]);
            }
        }
        int[][] secondMatrix = new int[3][3];

        int sum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        for (int r = 0; r < matrix.length - 2; r++) {
            for (int c = 0; c < matrix[r].length - 2; c++) {
                int currentSum = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2] +
                        matrix[r + 1][c] + matrix[r + 1][c + 1] + matrix[r + 1][c + 2] +
                        matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];
                if (currentSum > sum) {
                    sum = currentSum;
                    rowIndex = r;
                    colIndex = c;
                }
            }
        }
        System.out.printf("Sum = %d%n", sum);
        for (int r = rowIndex; r < rowIndex + 3; r++) {
            for (int c = colIndex; c < colIndex + 3; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}