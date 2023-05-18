package P02_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class EX_02_Matrix_of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = dimension[0];
        int column = dimension[1];

        String[][] matrix = new String[row][column];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                char cornerIndex = (char) ('a' + r);
                char secondIndex = (char) ('a' + r + c);
                matrix[r][c] = String.valueOf(cornerIndex) + secondIndex + cornerIndex;
            }

        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
