package Exams;

import java.util.Scanner;

public class TASK_02_Treasure_hunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        char[][] matrix = new char[rows][cols];

        int postitionRow = -1;
        int positionCol = -1;

        for (int r = 0; r < rows; r++) {
            String[] rowsInput = scanner.nextLine().split("\\s+");
            for (int c = 0; c < cols; c++) {
                char currentSymbol = rowsInput[c].charAt(0);
                matrix[r][c] = currentSymbol;
                if (currentSymbol == 'Y') {
                    postitionRow = r;
                    positionCol = c;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            switch (command) {
                case "left":
                    if (positionCol - 1 >= 0 && matrix[postitionRow][positionCol - 1] != 'T') {
                        positionCol--;
                        sb.append(command + " ");
                    }
                    break;
                case "right":
                    if (positionCol + 1 < cols && matrix[postitionRow][positionCol + 1] != 'T') {
                        positionCol++;
                        sb.append(command + " ");
                    }
                    break;
                case "up":
                    if (postitionRow - 1 >= 0 && matrix[postitionRow - 1][positionCol] != 'T') {
                        postitionRow--;
                        sb.append(command + " ");
                    }
                    break;
                case "down":
                    if (postitionRow + 1 < rows && matrix[postitionRow + 1][positionCol] != 'T') {
                        postitionRow++;
                        sb.append(command + " ");
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        if (matrix[postitionRow][positionCol] != 'X') {
            System.out.println("The map is fake!");
        } else {
            System.out.println("I've found the treasure!");
            String[] stepsFormat = sb.toString().split(" ");
            String format = String.join(", ", stepsFormat);
            System.out.printf("The right path is " + format);
        }
    }
}