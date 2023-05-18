package P01_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class EX_03_Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int command = Integer.parseInt(input[0]);
            int digit = 0;

            if (input.length == 2) {
                digit = Integer.parseInt(input[1]);
            }

            if (command == 1) {
                stack.push(digit);
            } else if (command == 2) {
                stack.pop();
            } else if (command == 3) {
                int maxDigit = Integer.MIN_VALUE;
                for (int item : stack) {
                    if (item > maxDigit) {
                        maxDigit = item;
                    }
                }
                System.out.println(maxDigit);
            }
        }
    }
}