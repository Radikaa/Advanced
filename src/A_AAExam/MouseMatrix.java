package A_AAExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MouseMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensionMatrix = scanner.nextLine().split(",");

        int row = Integer.parseInt(dimensionMatrix[0]);
        int col = Integer.parseInt(dimensionMatrix[1]);
        char[][] matrix = new char[row][col];
        fillMatrix(scanner, matrix);

        List<Integer> listMouse = new ArrayList<>();
        findMouse(matrix, listMouse);
        int mouseRow = listMouse.get(0);
        int mouseCol = listMouse.get(1);

        boolean isOutsideMatrix = false;
        boolean isMouseHappy = false;
        boolean isTrap = false;
        String command = scanner.nextLine();
        while (!command.equals("danger") && isOutsideMatrix == false && isMouseHappy == false && isTrap == false) {
            matrix[mouseRow][mouseCol] = '*';
            switch (command) {
                case "left":
                    if (mouseCol - 1 < 0) {
                        isOutsideMatrix = true;
                        matrix[mouseRow][mouseCol] = 'M';
                        break;
                    } else {
                        if (matrix[mouseRow][mouseCol - 1] != '@') {
                            mouseCol--;
                        }
                    }
                    break;
                case "right":
                    if (mouseCol + 1 == col) {
                        isOutsideMatrix = true;
                        matrix[mouseRow][mouseCol] = 'M';
                        break;
                    } else {
                        if (matrix[mouseRow][mouseCol + 1] != '@') {
                            mouseCol++;
                        }
                    }
                    break;
                case "up":
                    if (mouseRow - 1 < 0) {
                        isOutsideMatrix = true;
                        matrix[mouseRow][mouseCol] = 'M';
                        break;
                    } else {
                        if (matrix[mouseRow - 1][mouseCol] != '@') {
                            mouseRow--;
                        }
                    }
                    break;
                case "down":
                    if (mouseRow + 1 == row) {
                        isOutsideMatrix = true;
                        matrix[mouseRow][mouseCol] = 'M';
                        break;
                    } else {
                        if (matrix[mouseRow + 1][mouseCol] != '@') {
                            mouseRow++;
                        }
                    }
                    break;
            }
            if (matrix[mouseRow][mouseCol] == 'C') {
                matrix[mouseRow][mouseCol] = 'M';
                int cheeseRow = -1;
                cheeseRow = getCheeseRow(matrix, cheeseRow);
                if (cheeseRow == -1) {
                    isMouseHappy = true;
                    break;
                }
            } else if (matrix[mouseRow][mouseCol] == 'T') {
                matrix[mouseRow][mouseCol] = 'M';
                isTrap = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (isOutsideMatrix) {
            System.out.println("No more cheese for tonight!");
        } else if (isMouseHappy) {
            System.out.println("Happy mouse! All the cheese is eaten, good night!");
        } else if (isTrap) {
            System.out.println("Mouse is trapped!");
        } else if (isMouseHappy == false) {
            System.out.println("Mouse will come back later!");
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    private static int getCheeseRow(char[][] matrix, int cheeseRow) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == 'C') {
                    cheeseRow = r;
                }
            }
        }
        return cheeseRow;
    }

    private static void findMouse(char[][] matrix, List<Integer> listMouse) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                char symbol = matrix[r][c];
                if (symbol == 'M') {
                    listMouse.add(r);
                    listMouse.add(c);
                }
            }
        }
    }

    private static void fillMatrix(Scanner scanner, char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            String[] inputLine = scanner.nextLine().split("");
            for (int c = 0; c < matrix[r].length; c++) {
                char symbol = inputLine[c].charAt(0);
                matrix[r][c] = symbol;
            }
        }
    }
}