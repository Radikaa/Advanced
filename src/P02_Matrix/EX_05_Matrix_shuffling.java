package P02_Matrix;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class EX_05_Matrix_shuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int col = dimensions[1];
        String[][] matrix = new String[row][col];

        for (int r = 0; r < matrix.length; r++) {
            String[] rowsInput = scanner.nextLine().split(" ");
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = rowsInput[c];
            }
        }
        String command = scanner.nextLine();
        boolean isValid = true;

        while (!command.equals("END")) {
            isValid = true;
            String[] inputArr = command.split(" ");
            if (inputArr.length != 5 || !inputArr[0].equals("swap")) {
                isValid = false;
            }

            int oldFirst = 0;
            int oldSecond = 0;
            int newFirst = 0;
            int newSecond = 0;

            if (isValid == true) {
                for (int i = 1; i < inputArr.length; i++) {
                    if (i == 1) {
                        oldFirst = Integer.parseInt(inputArr[i]);
                    } else if (i == 2) {
                        oldSecond = Integer.parseInt(inputArr[i]);
                    } else if (i == 3) {
                        newFirst = Integer.parseInt(inputArr[i]);
                    } else if (i == 4) {
                        newSecond = Integer.parseInt(inputArr[i]);
                    }
                    if ((row < oldFirst) || (row < newFirst) || (col < oldSecond) || (col < newSecond)) {
                        isValid = false;
                    }
                }
            }
            if (isValid == false) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }

            String oldPosition = matrix[oldFirst][oldSecond];
            matrix[oldFirst][oldSecond] = matrix[newFirst][newSecond];
            matrix[newFirst][newSecond] = oldPosition;

            if (isValid == true) {
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix[r].length; c++) {
                        System.out.print(matrix[r][c] + " ");
                    }
                    System.out.println();
                }
            }
            command = scanner.nextLine();
        }
    }
}