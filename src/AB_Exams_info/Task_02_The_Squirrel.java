package AB_Exams_info;

import java.util.Scanner;

public class Task_02_The_Squirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] directionsArr = scanner.nextLine().split(", ");
        int countOfHazelnuts = 0;
        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            char[] inputArr = scanner.nextLine().toCharArray();
            matrix[row] = inputArr;
        }
        int rowSquirrel = 0;
        int colSquirrel = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                char symbol = matrix[row][col];
                if (symbol == 's') {
                    rowSquirrel = row;
                    colSquirrel = col;
                }
            }
        }
        boolean isTrap = false;
        boolean isCountThree = false;
        boolean isInMatrix = false;

        for (int i = 0; i < directionsArr.length; i++) {
            String command = directionsArr[i];
            if (command.equals("left")) {
                if (colSquirrel - 1 >= 0) {
                    matrix[rowSquirrel][colSquirrel] = '*';
                    colSquirrel--;
                } else {
                    isInMatrix = true;
                    break;
                }
                if (matrix[rowSquirrel][colSquirrel] == 'h') {
                    matrix[rowSquirrel][colSquirrel] = 's';
                    countOfHazelnuts++;
                    if (countOfHazelnuts == 3) {
                        isCountThree = true;
                        break;
                    }
                } else if (matrix[rowSquirrel][colSquirrel] == 't') {
                    isTrap = true;
                    break;
                } else {
                    matrix[rowSquirrel][colSquirrel] = 's';
                }

            } else if (command.equals("right")) {
                if (colSquirrel + 1 <= size - 1) {
                    matrix[rowSquirrel][colSquirrel] = '*';
                    colSquirrel++;
                } else {
                    isInMatrix = true;
                    break;
                }
                if (matrix[rowSquirrel][colSquirrel] == 'h') {
                    matrix[rowSquirrel][colSquirrel] = 's';
                    countOfHazelnuts++;
                    if (countOfHazelnuts == 3) {
                        isCountThree = true;
                        break;
                    }
                } else if (matrix[rowSquirrel][colSquirrel] == 't') {
                    isTrap = true;
                    break;
                } else {
                    matrix[rowSquirrel][colSquirrel] = 's';
                }

            } else if (command.equals("up")) {
                if (rowSquirrel - 1 >= 0) {
                    matrix[rowSquirrel][colSquirrel] = '*';
                    rowSquirrel--;
                } else {
                    isInMatrix = true;
                    break;
                }
                if (matrix[rowSquirrel][colSquirrel] == 'h') {
                    matrix[rowSquirrel][colSquirrel] = 's';
                    countOfHazelnuts++;
                    if (countOfHazelnuts == 3) {
                        isCountThree = true;
                        break;
                    }
                } else if (matrix[rowSquirrel][colSquirrel] == 't') {
                    isTrap = true;
                    break;
                } else {
                    matrix[rowSquirrel][colSquirrel] = 's';
                }

            } else if (command.equals("down")) {
                if (rowSquirrel + 1 <= size - 1) {
                    matrix[rowSquirrel][colSquirrel] = '*';
                    rowSquirrel++;
                } else {
                    isInMatrix = true;
                    break;
                }
                if (matrix[rowSquirrel][colSquirrel] == 'h') {
                    matrix[rowSquirrel][colSquirrel] = 's';
                    countOfHazelnuts++;
                    if (countOfHazelnuts == 3) {
                        isCountThree = true;
                        break;
                    }
                } else if (matrix[rowSquirrel][colSquirrel] == 't') {
                    isTrap = true;
                    break;
                } else {
                    matrix[rowSquirrel][colSquirrel] = 's';
                }
            }
        }

        if (isTrap == true) {
            System.out.println("Unfortunately, the squirrel stepped on a trap...");
        } else if (isInMatrix == true) {
            System.out.println("The squirrel is out of the field.");
        } else if (countOfHazelnuts < 3) {
            System.out.println("There are more hazelnuts to collect.");
        } else if (countOfHazelnuts == 3) {
            System.out.println("Good job! You have collected all hazelnuts!");
        }
        System.out.printf("Hazelnuts collected: %d", countOfHazelnuts);
    }
}