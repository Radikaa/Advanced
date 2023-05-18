package P02_Matrix;

import java.util.Scanner;

public class Lab_01_Compare_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrixFirst = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                matrixFirst[r][c] = scanner.nextInt();
            }
        }

        row = scanner.nextInt();
        column = scanner.nextInt();
        int[][] matrixSecond = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                matrixSecond[r][c] = scanner.nextInt();
            }
        }

        boolean areEqual = true;
        boolean check = true;

        if (matrixFirst.length != matrixSecond.length) {
            areEqual = false;
        }
        if (matrixFirst.length == matrixSecond.length) {
            for (int r = 0; r < matrixFirst.length; r++) {
                if (check) {
                    int[] firstArr = matrixFirst[r];
                    int[] secondArr = matrixSecond[r];

                    if (firstArr.length != secondArr.length) {
                        check = false;
                        areEqual = false;
                    }

                    for (int i = 0; i < firstArr.length; i++) {
                        if (check) {
                            int firstNumber = firstArr[i];
                            int secondNumber = secondArr[i];
                            if (firstNumber != secondNumber) {
                                areEqual = false;
                                check = false;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}