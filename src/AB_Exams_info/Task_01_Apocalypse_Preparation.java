package AB_Exams_info;

import java.util.*;

public class Task_01_Apocalypse_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputTextiles = scanner.nextLine().split("\\s+");
        String[] inputMedicaments = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> queueTextiles = new ArrayDeque<>();
        ArrayDeque<Integer> stackMedicaments = new ArrayDeque<>();

        Arrays.stream(inputTextiles).mapToInt(Integer::parseInt).forEach(queueTextiles::offer);
        Arrays.stream(inputMedicaments).mapToInt(Integer::parseInt).forEach(stackMedicaments::push);
        Map<String, Integer> mapItem = new TreeMap<>();

        while (queueTextiles.size() > 0 && stackMedicaments.size() > 0) {
            int queueDigit = queueTextiles.peek();
            int stackDigit = stackMedicaments.peek();
            int currentSum = queueDigit + stackDigit;
            if (currentSum == 30) {
                mapItem.putIfAbsent("Patch", 0);
                int currentValue = mapItem.get("Patch");
                mapItem.put("Patch", currentValue + 1);
                queueTextiles.poll();
                stackMedicaments.pop();
            } else if (currentSum == 40) {
                mapItem.putIfAbsent("Bandage", 0);
                int currentValue = mapItem.get("Bandage");
                mapItem.put("Bandage", currentValue + 1);
                queueTextiles.poll();
                stackMedicaments.pop();
            } else if (currentSum == 100) {
                mapItem.putIfAbsent("MedKit", 0);
                int currentValue = mapItem.get("MedKit");
                mapItem.put("MedKit", currentValue + 1);
                queueTextiles.poll();
                stackMedicaments.pop();
            } else if (currentSum > 100) {
                mapItem.putIfAbsent("MedKit", 0);
                int currentValue = mapItem.get("MedKit");
                mapItem.put("MedKit", currentValue + 1);
                int sumDiference = currentSum - 100;
                stackMedicaments.pop();
                queueTextiles.poll();
                stackMedicaments.push(stackMedicaments.pop() + sumDiference);
            } else {
                stackMedicaments.push(stackMedicaments.pop() + 10);
                queueTextiles.poll();
            }
        }

        List<Map.Entry<String, Integer>> orderedItems = new ArrayList<>(mapItem.entrySet());
        Collections.sort(orderedItems,
                                                Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed().
                                                thenComparing(Map.Entry<String, Integer>::getKey));

        if ((queueTextiles.size() == 0) && (stackMedicaments.size() == 0)) {
            System.out.println("Textiles and medicaments are both empty.");
            orderedItems.stream().filter(e -> e.getValue() != 0).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
        } else if (queueTextiles.size() == 0) {
            System.out.println("Textiles are empty.");
            orderedItems.stream().filter(e -> e.getValue() != 0).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
            System.out.print("Medicaments left: " + stackMedicaments.toString().replace("[", "").replace("]", ""));
        } else if (stackMedicaments.size() == 0) {
            System.out.println("Medicaments are empty.");
            orderedItems.stream().filter(e -> e.getValue() != 0).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
            System.out.print("Textiles left: " + queueTextiles.toString().replace("[", "").replace("]", ""));
        }
    }
}