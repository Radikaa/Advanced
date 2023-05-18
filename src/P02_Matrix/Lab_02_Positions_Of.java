package P02_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_02_Positions_Of {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int column = dimensions[1];
        int[][] matrix = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }
        int checker = scanner.nextInt();
        boolean isPrint = false;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int currentDigit = matrix[r][c];
                if (currentDigit == checker) {
                    System.out.println(r + " " + c);
                    isPrint = true;
                }
            }
        }
        if (isPrint == false) {
            System.out.println("not found");
        }
    }
}