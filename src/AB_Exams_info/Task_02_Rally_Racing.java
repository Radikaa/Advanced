package AB_Exams_info;

import java.util.Arrays;
import java.util.Scanner;

public class Task_02_Rally_Racing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfMatrix = Integer.parseInt(scanner.nextLine());
        int trackedCar = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[sizeOfMatrix][sizeOfMatrix];

        int carRow = 0;
        int carCol = 0;
        fillMatrix(scanner, matrix);

        int kilometers = 0;
        String command = scanner.nextLine();

        while (matrix[carRow][carCol] != 'F') {
            if (command.equals("End")) {
                matrix[carRow][carCol] = 'C';
                System.out.printf("Racing car %d DNF.%n", trackedCar);
                System.out.printf("Distance covered %d km.%n", kilometers);
                break;
            }

            matrix[carRow][carCol] = '.';
            switch (command) {
                case "left":
                    carCol--;
                    break;
                case "right":
                    carCol++;
                    break;
                case "up":
                    carRow--;
                    break;
                case "down":
                    carRow++;
                    break;
            }

            if (matrix[carRow][carCol] == 'T') {
                matrix[carRow][carCol] = '.';
                int othertunnelnRow = -1;
                int otherTunnelnCol = -1;
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < matrix[r].length; c++) {
                        if (matrix[r][c] == 'T') {
                            othertunnelnRow = r;
                            otherTunnelnCol = c;
                        }
                    }
                }
                kilometers += 30;
                carRow = othertunnelnRow;
                carCol = otherTunnelnCol;
                matrix[carRow][carCol] = 'C';
            } else if (matrix[carRow][carCol] == '.') {
                kilometers += 10;
                matrix[carRow][carCol] = 'C';
            } else if (matrix[carRow][carCol] == 'F') {
                kilometers += 10;
                matrix[carRow][carCol] = 'C';
                System.out.printf("Racing car %d finished the stage!%n", trackedCar);
                System.out.printf("Distance covered %d km.%n", kilometers);
                break;
            }

            command = scanner.nextLine();
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            String[] rowMatrix = scanner.nextLine().split(" ");
            for (int c = 0; c < matrix[r].length; c++) {
                char currentSymbol = rowMatrix[c].charAt(0);
                matrix[r][c] = currentSymbol;
            }
        }
    }
}