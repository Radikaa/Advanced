package P05_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EX_04_Applied_Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    list = list.stream().map(n -> n + 1).collect(Collectors.toList());
                    break;
                case "multiply":
                    list = list.stream().map(n -> n * 2).collect(Collectors.toList());
                    break;
                case "subtract":
                    list = list.stream().map(n -> n - 1).collect(Collectors.toList());
                    break;
                case "print":
                    list.forEach(n -> System.out.print(n + " "));
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}