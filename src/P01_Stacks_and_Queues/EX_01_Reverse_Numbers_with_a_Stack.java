package P01_Stacks_and_Queues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class EX_01_Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < inputArr.length; i++) {
            String digit = inputArr[i];
            stack.push(digit);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}