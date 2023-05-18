package P02_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_03_Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[row][column];
        char[][] secondMatrix = new char[row][column];

        for (int r = 0; r < row; r++) {
            firstMatrix[r] = scanner.nextLine().toCharArray();
        }

        for (int r = 0; r < row; r++) {
            secondMatrix[r] = scanner.nextLine().toCharArray();
        }

        for (int r = 0; r < firstMatrix.length; r++) {
            for (int c = 0; c < firstMatrix[r].length; c++) {
                if (firstMatrix[r][c] == secondMatrix[r][c]) {
                    System.out.print(firstMatrix[r][c]);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}