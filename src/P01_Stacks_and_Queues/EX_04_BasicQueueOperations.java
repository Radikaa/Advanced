package P01_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class EX_04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = scanner.nextInt(); //number of elements to enqueue - add
        int s = scanner.nextInt(); //number of elements to dequeue - remove/poll
        int x = scanner.nextInt(); //check whether is present in the queue

        for (int i = 1; i <= n; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 1; i <= s; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(x)) {
            System.out.println("true");
        } else {
            int minDigit = Integer.MAX_VALUE;
            for (Integer integer : queue) {
                if (integer<minDigit) {
                    minDigit = integer;
                }
            }
            System.out.println(minDigit);
        }
    }
}
