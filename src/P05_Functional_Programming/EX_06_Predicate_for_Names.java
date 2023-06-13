package P05_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EX_06_Predicate_for_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLetter = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Predicate<String> predicate = n -> n.length() <= countLetter;
        names.stream().filter(predicate).forEach(System.out::println);
    }
}