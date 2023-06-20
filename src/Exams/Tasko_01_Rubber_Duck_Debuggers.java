package Exams;

import java.util.*;

public class Tasko_01_Rubber_Duck_Debuggers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] queueArr = scanner.nextLine().split("\\s+");
        String[] stackArr = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> queueTime = new ArrayDeque<>();
        Arrays.stream(queueArr).mapToInt(Integer::parseInt).forEach(queueTime::offer);

        ArrayDeque<Integer> stackTask = new ArrayDeque<>();
        Arrays.stream(stackArr).mapToInt(Integer::parseInt).forEach(stackTask::push);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Darth Vader Ducky", 0);
        map.put("Thor Ducky", 0);
        map.put("Big Blue Rubber Ducky", 0);
        map.put("Small Yellow Rubber Ducky", 0);

        while (queueTime.size() > 0 && stackTask.size() > 0) {
            int digitProgrammers = queueTime.peek();
            int digitTasks = stackTask.peek();
            int count = digitProgrammers * digitTasks;
            if (0 <= count && count <= 60) {
                map.put("Darth Vader Ducky", map.get("Darth Vader Ducky") + 1);
                queueTime.poll();
                stackTask.pop();
            } else if (61 <= count && count <= 120) {
                map.put("Thor Ducky", map.get("Thor Ducky") + 1);
                queueTime.poll();
                stackTask.pop();
            } else if (121 <= count && count <= 180) {
                map.put("Big Blue Rubber Ducky", map.get("Big Blue Rubber Ducky") + 1);
                queueTime.poll();
                stackTask.pop();
            } else if (181 <= count && count <= 240) {
                map.put("Small Yellow Rubber Ducky", map.get("Small Yellow Rubber Ducky") + 1);
                queueTime.poll();
                stackTask.pop();
            } else {
                //int queueDigitToMove = queueTime.poll();
                //queueTime.offer(queueDigitToMove);
                queueTime.offer(queueTime.poll());

                int decreaseTaskDigit = stackTask.peek() - 2;
                stackTask.pop();
                stackTask.push(decreaseTaskDigit);

            }

        }
        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");
        map.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}