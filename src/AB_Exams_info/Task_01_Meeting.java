    package AB_Exams_info;

    import java.lang.reflect.Array;
    import java.util.*;
    import java.util.stream.Collectors;

    public class Task_01_Meeting {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Queue- offer, poll, peek
            //Stack - push, pop, peek
            ArrayDeque<Integer> stackMans = new ArrayDeque<>();
            Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(stackMans::push);
            ArrayDeque<Integer> queueWoman = new ArrayDeque<>();
            Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(queueWoman::offer);

            int matchCount = 0;
            List<Integer> leftMans = new ArrayList<>();
            List<Integer> leftWomans = new ArrayList<>();


            while (stackMans.size() > 0 && queueWoman.size() > 0) {
                if (queueWoman.peek() <= 0 || stackMans.peek() <= 0) {
                    if (queueWoman.peek() <= 0) {
                        queueWoman.poll();
                    }
                    if (stackMans.peek() <= 0) {
                        stackMans.pop();
                    }
                } else if (stackMans.peek() % 25 == 0 || queueWoman.peek() % 25 == 0) {
                    if (stackMans.peek() % 25 == 0) {
                        stackMans.pop();
                        stackMans.pop();
                    }
                    if (queueWoman.peek() % 25 == 0) {
                        queueWoman.poll();
                        queueWoman.poll();
                    }
                } else {
                    if (stackMans.peek() == queueWoman.peek()) {
                        matchCount++;
                        stackMans.pop();
                        queueWoman.poll();
                    } else {
                        queueWoman.poll();
                        int newLastMan = stackMans.peek() - 2;
                        stackMans.pop();
                        stackMans.push(newLastMan);
                    }
                }
            }

            while (!stackMans.isEmpty()) {
                leftMans.add(stackMans.pop());
            }
            while (!queueWoman.isEmpty()) {
                leftWomans.add(queueWoman.poll());
            }

            System.out.printf("Matches: %d%n", matchCount);
            if (leftMans.isEmpty()) {
                System.out.println("Males left: none");
            } else {
                String result = leftMans.stream().map(Object::toString).collect(Collectors.joining(", "));
                System.out.println("Males left: " + result);
            }

            if (leftWomans.isEmpty()) {
                System.out.println("Females left: none");
            } else {
                String result = leftWomans.stream().map(Object::toString).collect(Collectors.joining(", "));
                System.out.println("Females left: " + result);
            }
        }
    }