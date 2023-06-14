package AB_Exams_info;

import java.util.*;

public class Task_01_Santa_Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackMmaterial = new Stack<>();
        ArrayDeque<Integer> queueMagic = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(stackMmaterial::push);
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(queueMagic::offer);
        Map<String, Integer> mapItem = new TreeMap<>();
        mapItem.put("Doll", 0);
        mapItem.put("Wooden train", 0);
        mapItem.put("Teddy bear", 0);
        mapItem.put("Bicycle", 0);

        while (stackMmaterial.size() > 0 && queueMagic.size() > 0) {
            int stackDigit = stackMmaterial.peek();
            int queueDigit = queueMagic.peek();
            int result = stackDigit * queueDigit;
            if (result == 150) {
                mapItem.put("Doll", mapItem.get("Doll") + 1);
                stackMmaterial.pop();
                queueMagic.poll();
            } else if (result == 250) {
                mapItem.put("Wooden train", mapItem.get("Wooden train") + 1);
                stackMmaterial.pop();
                queueMagic.poll();
            } else if (result == 300) {
                mapItem.put("Teddy bear", mapItem.get("Teddy bear") + 1);
                stackMmaterial.pop();
                queueMagic.poll();
            } else if (result == 400) {
                mapItem.put("Bicycle", mapItem.get("Bicycle") + 1);
                stackMmaterial.pop();
                queueMagic.poll();
            } else if (result < 0) {
                int sum = stackDigit + queueDigit;
                stackMmaterial.pop();
                queueMagic.poll();
                stackMmaterial.push(sum);
            } else if (result > 0) { // here
                queueMagic.poll();
                int currentSum = stackMmaterial.pop() + 15;
                stackMmaterial.push(currentSum);
            } else if (stackDigit == 0 || queueDigit == 0) {
                if (stackDigit == 0) {
                    stackMmaterial.pop();
                }
                if (queueDigit == 0) {
                    queueMagic.poll();
                }
            }
        }

        if ((mapItem.get("Doll") != 0 && mapItem.get("Wooden train") != 0) || (mapItem.get("Teddy bear") > 0 && mapItem.get("Bicycle") > 0)) {
            System.out.println("The presents are crafted! Merry Christmas!");
        } else {
            System.out.println("No presents this Christmas!");
        }

        if (!stackMmaterial.isEmpty()) {
            System.out.print("Materials left: ");
            //[3, 4, 5]
            Collections.reverse(stackMmaterial);
            System.out.println(stackMmaterial.toString().replace("[", "").replace("]", ""));
        }
        if (!queueMagic.isEmpty()) {
            System.out.print("Magic left: ");
            System.out.println(queueMagic.toString().replace("[", "").replace("]", ""));
        }

        for (Map.Entry<String, Integer> entry : mapItem.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        }
    }
}