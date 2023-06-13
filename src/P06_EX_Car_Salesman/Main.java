package P06_EX_Car_Salesman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String model = inputArr[0];
            int power = Integer.parseInt(inputArr[1]);
            int displacement = Integer.parseInt(inputArr[2]);
            int efficiency = Integer.parseInt(inputArr[3]);


        }
    }
}