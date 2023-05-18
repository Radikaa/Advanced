package P01_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab_08_Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> stackBack = new ArrayDeque<>();
        ArrayDeque<String> stackForward = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("forward") && stackForward.isEmpty()) {
                System.out.println("no next URLs");

            } else if (input.equals("back") && stackBack.size() <= 1) {
                System.out.println("no previous URLs");

            } else if (input.equals("forward")) {
                stackBack.push(stackForward.peek());
                System.out.println(stackForward.pop());

            } else if (input.equals("back")) {
                stackForward.push(stackBack.pop());
                System.out.println(stackBack.peek());

            } else {
                stackForward.clear();
                System.out.println(input);
                stackBack.push(input);
            }
            input = scanner.nextLine();
        }
    }
}