package P01_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab_02_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = inputArr.length - 1; i >= 0; i--) {
            String currentSymbol = inputArr[i];
            stack.push(currentSymbol);
        }
        while (stack.size() > 1) {
            int firstDigit = Integer.parseInt(stack.pop());
            String math = stack.pop();
            int secondDigit = Integer.parseInt(stack.pop());
            if (math.equals("-")) {
                stack.push(String.valueOf(firstDigit - secondDigit));
            } else {
                stack.push(String.valueOf(firstDigit + secondDigit));
            }
        }
        System.out.println(stack.pop());
    }
}