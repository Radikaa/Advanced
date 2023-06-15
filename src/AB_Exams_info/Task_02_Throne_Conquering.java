package AB_Exams_info;

import java.util.Scanner;

public class Task_02_Throne_Conquering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energyOfParis = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];
        boolean dead = false;
        boolean isFind = false;

        for (int r = 0; r < size; r++) {
            matrix[r] = scanner.nextLine().toCharArray();
            for (int c = 0; c < size; c++) {
            }
        }

        int parisRow = -1;
        int parisCol = -1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'P') {
                    parisRow = row;
                    parisCol = col;
                    break;
                }
            }
        }
        matrix[parisRow][parisCol] = '-';

        while (energyOfParis > 0) {
            String[] commamdArr = scanner.nextLine().split("\\s+");
            String command = commamdArr[0];
            int enemyRow = Integer.parseInt(commamdArr[1]);
            int enemyCol = Integer.parseInt(commamdArr[2]);
            matrix[enemyRow][enemyCol] = 'S';

            if (command.equals("left")) {
                if (parisCol - 1 >= 0) {
                    parisCol--;
                }
            } else if (command.equals("right")) {
                if (parisCol + 1 < matrix.length) {
                    parisCol++;
                }
            } else if (command.equals("up")) {
                if (parisRow - 1 >= 0) {
                    parisRow--;
                }
            } else if (command.equals("down")) {
                if (parisRow + 1 < matrix.length) {
                    parisRow++;
                }
            }
            energyOfParis--;


            if (energyOfParis <= 0) {
                dead = true;
                matrix[parisRow][parisCol] = 'X';
                break;
            }

            if (matrix[parisRow][parisCol] == 'H') {
                isFind = true;
                matrix[parisRow][parisCol] = '-';
                break;
            } else if (matrix[parisRow][parisCol] == 'S') {
                energyOfParis -= 2;
                if (energyOfParis <= 0) {
                    dead = true;
                    matrix[parisRow][parisCol] = 'X';
                    break;
                }
                matrix[parisRow][parisCol] = '-';
            }
        }
        if (isFind) {
            System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n", energyOfParis);
        }
        if (dead) {
            System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
        }
        //wrong print
      /*  for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }*/

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}