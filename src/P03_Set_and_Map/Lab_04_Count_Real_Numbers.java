package P03_Set_and_Map;

import java.util.*;

public class Lab_04_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double, Integer> map = new LinkedHashMap<>();
        for (Double digit : inputArr) {
            map.putIfAbsent(digit, 0);
            int digitValue = map.get(digit);
            map.put(digit, digitValue + 1);
        }
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}