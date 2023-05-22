package P03_Set_and_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EX_05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("search")) {
            String[] inputArr = input.split("-");
            String name = inputArr[0];
            String number = inputArr[1];
            map.putIfAbsent(name, "");
            map.put(name, number);

            input = scanner.nextLine();
        }

        String nextInput = scanner.nextLine();
        while (!nextInput.equals("stop")) {
            if (map.containsKey(nextInput)) {
                System.out.printf("%s -> %s%n", nextInput, map.get(nextInput));
            } else {
                System.out.printf("Contact %s does not exist.%n", nextInput);
            }
            nextInput = scanner.nextLine();
        }
    }
}
