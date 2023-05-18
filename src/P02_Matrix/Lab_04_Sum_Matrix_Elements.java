package P02_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_04_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int column = dimensions[1];
        int[][] matrix = new int[row][column];

        for (int r = 0; r < row; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }
        System.out.println(row);
        System.out.println(column);
        System.out.println(sum);
    }
}
