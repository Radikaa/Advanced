package P03_Set_and_Map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EX_03_Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            for (int j = 0; j < inputArr.length; j++) {
                set.add(inputArr[j]);
            }
        }

        for (String s : set) {
            System.out.print(s + " ");

        }
    }
}
