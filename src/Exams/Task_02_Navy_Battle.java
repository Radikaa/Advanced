package Exams;

import java.util.Scanner;

public class Task_02_Navy_Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];
        int submarineRow = -1;
        int submarineCol = -1;

        for (int r = 0; r < size; r++) {
            matrix[r] = scanner.nextLine().toCharArray();
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                char currentPosition = matrix[r][c];
                if (currentPosition == 'S') {
                    submarineRow = r;
                    submarineCol = c;
                }
            }
        }
        int damageCount = 0;
        int cruiserCount = 0;

        while (damageCount < 3 && cruiserCount < 3) {
            String command = scanner.nextLine();
            if (command.equals("left")) {
                matrix[submarineRow][submarineCol] = '-';
                submarineCol--;
                if (matrix[submarineRow][submarineCol] == '-') {
                    matrix[submarineRow][submarineCol] = 'S';
                } else if (matrix[submarineRow][submarineCol] == '*') {
                    matrix[submarineRow][submarineCol] = '-';
                    damageCount++;
                    matrix[submarineRow][submarineCol] = 'S';
                } else if (matrix[submarineRow][submarineCol] == 'C') {
                    matrix[submarineRow][submarineCol] = '-';
                    cruiserCount++;
                    matrix[submarineRow][submarineCol] = 'S';
                }
            } else if (command.equals("right")) {
                matrix[submarineRow][submarineCol] = '-';
                submarineCol++;
                if (matrix[submarineRow][submarineCol] == '-') {
                    matrix[submarineRow][submarineCol] = 'S';
                } else if (matrix[submarineRow][submarineCol] == '*') {
                    matrix[submarineRow][submarineCol] = '-';
                    damageCount++;
                    matrix[submarineRow][submarineCol] = 'S';
                } else if (matrix[submarineRow][submarineCol] == 'C') {
                    matrix[submarineRow][submarineCol] = '-';
                    cruiserCount++;
                    matrix[submarineRow][submarineCol] = 'S';
                }
            } else if (command.equals("up")) {
                matrix[submarineRow][submarineCol] = '-';
                submarineRow--;
                if (matrix[submarineRow][submarineCol] == '-') {
                    matrix[submarineRow][submarineCol] = 'S';
                } else if (matrix[submarineRow][submarineCol] == '*') {
                    matrix[submarineRow][submarineCol] = '-';
                    damageCount++;
                    matrix[submarineRow][submarineCol] = 'S';
                } else if (matrix[submarineRow][submarineCol] == 'C') {
                    matrix[submarineRow][submarineCol] = '-';
                    cruiserCount++;
                    matrix[submarineRow][submarineCol] = 'S';
                }
            } else if (command.equals("down")) {
                matrix[submarineRow][submarineCol] = '-';
                submarineRow++;
                if (matrix[submarineRow][submarineCol] == '-') {
                    matrix[submarineRow][submarineCol] = 'S';
                } else if (matrix[submarineRow][submarineCol] == '*') {
                    matrix[submarineRow][submarineCol] = '-';
                    damageCount++;
                    matrix[submarineRow][submarineCol] = 'S';
                } else if (matrix[submarineRow][submarineCol] == 'C') {
                    matrix[submarineRow][submarineCol] = '-';
                    cruiserCount++;
                    matrix[submarineRow][submarineCol] = 'S';
                }
            }
        }

        if (damageCount == 3) {
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", submarineRow, submarineCol);
        } else {
            System.out.printf("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!%n");
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}