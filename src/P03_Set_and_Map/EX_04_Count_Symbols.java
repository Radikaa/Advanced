package P03_Set_and_Map;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EX_04_Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> map = new TreeMap();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            map.putIfAbsent(symbol, 0);
            int currentCount = map.get(symbol);
            map.put(symbol, currentCount + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}