package Exams;

import java.util.Scanner;

public class Task_02_Blind_Man_is_Buff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputDimension = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(inputDimension[0]);
        int cols = Integer.parseInt(inputDimension[1]);

        char[][] matrix = new char[rows][cols];
        int playerRow = -1;
        int playerCol = -1;

        for (int r = 0; r < rows; r++) {
            String[] rowsInput = scanner.nextLine().split("\\s+");
            for (int c = 0; c < cols; c++) {
                char currentSymbol = rowsInput[c].charAt(0);
                matrix[r][c] = currentSymbol;
                if (currentSymbol == 'B') {
                    playerRow = r;
                    playerCol = c;
                }
            }
        }

        int touchCount = 0;
        int moveCount = 0;
        String command = scanner.nextLine();

        while (touchCount < 3 && !command.equals("Finish")) {
            if (command.equals("up")) {
                if (playerRow - 1 >= 0) {
                    if (matrix[playerRow - 1][playerCol] == 'O') {
                        command = scanner.nextLine();
                        continue;
                    } else if (matrix[playerRow - 1][playerCol] == 'P') {
                        matrix[playerRow][playerCol] = '-';
                        playerRow--;
                        moveCount++;
                        touchCount++;
                        matrix[playerRow][playerCol] = 'B';
                    } else if (matrix[playerRow - 1][playerCol] == '-') {
                        matrix[playerRow][playerCol] = '-';
                        playerRow--;
                        moveCount++;
                        matrix[playerRow][playerCol] = 'B';
                    }
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            } else if (command.equals("down")) {
                if (playerRow + 1 < rows) {
                    if (matrix[playerRow + 1][playerCol] == 'O') {
                        command = scanner.nextLine();
                        continue;
                    } else if (matrix[playerRow + 1][playerCol] == 'P') {
                        matrix[playerRow][playerCol] = '-';
                        playerRow++;
                        moveCount++;
                        touchCount++;
                        matrix[playerRow][playerCol] = 'B';
                    } else if (matrix[playerRow + 1][playerCol] == '-') {
                        matrix[playerRow][playerCol] = '-';
                        playerRow++;
                        moveCount++;
                        matrix[playerRow][playerCol] = 'B';
                    }
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            } else if (command.equals("left")) {
                if (playerCol - 1 >= 0) {
                    if (matrix[playerRow][playerCol - 1] == 'O') {
                        command = scanner.nextLine();
                        continue;
                    } else if (matrix[playerRow][playerCol - 1] == 'P') {
                        matrix[playerRow][playerCol] = '-';
                        playerCol--;
                        moveCount++;
                        touchCount++;
                        matrix[playerRow][playerCol] = 'B';
                    } else if (matrix[playerRow][playerCol - 1] == '-') {
                        matrix[playerRow][playerCol] = '-';
                        playerCol--;
                        moveCount++;
                        matrix[playerRow][playerCol] = 'B';
                    }
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            } else if (command.equals("right")) {
                if (playerCol + 1 < cols) {
                    if (matrix[playerRow][playerCol + 1] == 'O') {
                        command = scanner.nextLine();
                        continue;
                    } else if (matrix[playerRow][playerCol + 1] == 'P') {
                        matrix[playerRow][playerCol] = '-';
                        playerCol++;
                        moveCount++;
                        touchCount++;
                        matrix[playerRow][playerCol] = 'B';
                    } else if (matrix[playerRow][playerCol + 1] == '-') {
                        matrix[playerRow][playerCol] = '-';
                        playerCol++;
                        moveCount++;
                        matrix[playerRow][playerCol] = 'B';
                    }
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d ", touchCount);
        System.out.printf("Moves made: %d", moveCount);
    }
}