package P03_Set_and_Map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EX_01_Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        HashSet<String> unique = new LinkedHashSet<>();

        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            unique.add(word);
        }
        for (String s : unique) {
            System.out.println(s);
        }
    }
}
