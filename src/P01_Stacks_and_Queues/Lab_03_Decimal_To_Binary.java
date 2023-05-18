package P01_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab_03_Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimal == 0) {
            System.out.println(0);
        }

        while (decimal != 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}