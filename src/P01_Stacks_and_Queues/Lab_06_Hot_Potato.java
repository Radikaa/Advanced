package P01_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab_06_Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String name : names) {
            queue.offer(name);
        }

        int count = 0;
        while (!queue.isEmpty()){
            if (queue.size() ==1) {
                System.out.println("Last is " + queue.peek());
                break;
            }
            count++;
            if (count == n) {
                System.out.println("Removed " + queue.poll());
                count = 0;
            } else {
                String moveToEnd = queue.poll();
                queue.offer(moveToEnd);
            }
        }
    }
}