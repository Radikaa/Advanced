package P03_Set_and_Map;

import java.util.Scanner;
import java.util.TreeSet;

public class Lab_02_SoftUni_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        TreeSet<String> person = new TreeSet<>();

        while (!command.equals("PARTY")) {
            person.add(command);
            command = scanner.nextLine();
        }

        String outgoing = scanner.nextLine();
        while (!outgoing.equals("END")) {
            if (person.contains(outgoing)) {
                person.remove(outgoing);
            }
            outgoing = scanner.nextLine();
        }

        System.out.println(person.size());
        for (String s : person) {
            System.out.println(s);
        }
    }
}