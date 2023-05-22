package P03_Set_and_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EX_06_Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> map = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")) {
                map.put(input, email);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> name : map.entrySet()) {
            System.out.printf("%s -> %s%n", name.getKey(), name.getValue());
        }
    }
}