package A_AAExam;

import java.util.*;

public class Task_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Stack - push, pop, peek
        // Queue- offer, poll, peek
        ArrayDeque<Integer> queueTools = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(queueTools::offer);

        ArrayDeque<Integer> stackSubstances = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(stackSubstances::push);

        List<Integer> listChallenges = new ArrayList<>();
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(listChallenges::add);

        while (!queueTools.isEmpty() && !stackSubstances.isEmpty()) {
            boolean isValid = false;
            int firstQueue = queueTools.peek();
            int lastStack = stackSubstances.peek();
            int multiplyElements = firstQueue * lastStack;

            for (int i = 0; i < listChallenges.size(); i++) {
                if (listChallenges.get(i) == multiplyElements) {
                    listChallenges.remove(i);
                    queueTools.poll();
                    stackSubstances.pop();
                    isValid = true;
                    break;
                }
            }
            if (isValid == false) {
                int queueToMove = queueTools.poll() + 1;
                queueTools.offer(queueToMove);
                int stackToMove = stackSubstances.pop() - 1;
                if (stackToMove != 0) {
                    stackSubstances.push(stackToMove);
                }

            }
        }
        System.out.println();
        if (listChallenges.isEmpty()) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        } else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }

        if (!stackSubstances.isEmpty()) {
            System.out.println("Substances: " + stackSubstances.toString().replace("[", "").replace("]", ""));
        }
        if (!queueTools.isEmpty()) {
            System.out.println("Tools: " + queueTools.toString().replace("[", "").replace("]", ""));
        }
        if (!listChallenges.isEmpty()) {
            System.out.println("Challenges: " + listChallenges.toString().replace("[", "").replace("]", ""));
        }
    }
}