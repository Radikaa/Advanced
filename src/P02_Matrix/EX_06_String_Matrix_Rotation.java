package P02_Matrix;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX_06_String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("[()]");
        int inputRotateDigit = Integer.parseInt(inputArr[1]);
        int rotatePosition = inputRotateDigit % 360;
        List<String> wordList = new ArrayList<>();
        String word = scanner.nextLine();
        int row = 0;

        while (!word.equals("END")) {
            wordList.add(word);
            word = scanner.nextLine();
            row++;
        }

        int col = Integer.MIN_VALUE;

        for (int i = 0; i < wordList.size() - 1; i++) {
            if (wordList.get(i).length() > col) {
                col = wordList.get(i).length();
            }
        }
        int rows = row;
        int cols = col;

        char[][] matrix = new char[row][col];

        for (int r = 0; r < rows; r++) {
            String currentWord = wordList.get(r);
            for (int c = 0; c < cols; c++) {
                if (c < currentWord.length()) {
                    char currentChar = currentWord.charAt(c);
                    matrix[r][c] = currentChar;
                } else {
                    matrix[r][c] = ' ';
                }
            }
        }

        if (rotatePosition == 0) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        } else if (rotatePosition == 90) {
            for (int c = 0; c < cols; c++) {
                for (int r = rows - 1; r >= 0; r--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        } else if (rotatePosition == 180) {
            for (int r = rows - 1; r >= 0; r--) {
                for (int c = cols - 1; c >= 0; c--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        } else if (rotatePosition == 270) {
            for (int c = cols - 1; c >= 0; c--) {
                for (int r = 0; r < rows; r++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }
    }
}