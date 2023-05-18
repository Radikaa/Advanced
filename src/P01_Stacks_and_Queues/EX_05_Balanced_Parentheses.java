package P01_Stacks_and_Queues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class EX_05_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isValid = true;
        boolean stackIsEmpty = false;
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == '{' || input[i] == '[' || input[i] == '(') {
                stack.push(input[i]);
                count++;
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                } else if (input[i] == ')') {
                    char priviousChar = stack.pop();
                    if (priviousChar != '(') {
                        isValid = false;
                    }
                } else if (input[i] == ']') {
                    char priviousChar = stack.pop();
                    if (priviousChar != '[') {
                        isValid = false;
                    }
                } else if (input[i] == '}') {
                    char priviousChar = stack.pop();
                    if (priviousChar != '{') {
                        isValid = false;
                    }
                }

            }
            if (stack.isEmpty() && count * 2 != input.length) {
                stackIsEmpty = true;
            }
        }
        if (stackIsEmpty == true) {
            System.out.println("NO");
        } else if (isValid == false) {
            System.out.println("NO");
        } else if (isValid == true && stack.isEmpty()) {
            System.out.println("YES");
        } else if ((isValid == true) && !stack.isEmpty()) {
            System.out.println("NO");
        }
    }
}