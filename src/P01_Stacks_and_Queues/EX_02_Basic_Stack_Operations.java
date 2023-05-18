package P01_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Scanner;

public class EX_02_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //number of elements to push into the stack
        int s = scanner.nextInt(); //number of elements to pop from the stack
        int x = scanner.nextInt(); //that you should check whether is present in the stack

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 1; i <= s; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(x)) {
            System.out.println("true");
        } else {
            int minDigit = Integer.MAX_VALUE;
            for (Integer integer : stack) {
                if (integer < minDigit) {
                    minDigit = integer;
                }
            }
            System.out.println(minDigit);
        }
    }
}
