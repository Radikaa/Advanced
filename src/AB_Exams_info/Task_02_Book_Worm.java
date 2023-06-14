package AB_Exams_info;

import java.util.Scanner;

public class Task_02_Book_Worm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLineInput = scanner.nextLine();
        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        StringBuilder sb = new StringBuilder(firstLineInput);
        int playerRow = -1;
        int playerCol = -1;

        for (int row = 0; row < size; row++) {
            matrix[row] = scanner.nextLine().split("");
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                String currentPosition = matrix[r][c];
                if (currentPosition.equals("P")) {
                    playerRow = r;
                    playerCol = c;
                }
            }
        }
        System.out.println();

        String command = scanner.nextLine();

        while (!command.contains("end")) {

            if (command.contains("left")) {
                if (playerCol - 1 >= 0) {
                    matrix[playerRow][playerCol] = "-";
                    playerCol--;
                    if (!matrix[playerRow][playerCol].equals("-")) {
                        sb.append(matrix[playerRow][playerCol]);
                        matrix[playerRow][playerCol] = "P";
                    }
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }

            } else if (command.contains("right")) {
                if (playerCol + 1 <= size - 1) {
                    matrix[playerRow][playerCol] = "-";
                    playerCol++;
                    if (!matrix[playerRow][playerCol].equals("-")) {
                        sb.append(matrix[playerRow][playerCol]);
                        matrix[playerRow][playerCol] = "P";
                    }
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else if (command.contains("up")) {
                if (playerRow - 1 >= 0) {
                    matrix[playerRow][playerCol] = "-";
                    playerRow--;
                    if (!matrix[playerRow][playerCol].equals("-")) {
                        sb.append(matrix[playerRow][playerCol]);
                        matrix[playerRow][playerCol] = "P";
                    }
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }

            } else if (command.contains("down")) {
                if (playerRow + 1 <= size - 1) {
                    matrix[playerRow][playerCol] = "-";
                    playerRow++;
                    if (!matrix[playerRow][playerCol].equals("-")) {
                        sb.append(matrix[playerRow][playerCol]);
                        matrix[playerRow][playerCol] = "P";
                    }
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(sb.toString());
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}