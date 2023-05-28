package P05_Functional_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lab_06_Find_Evens_or_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bound = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int lowerBound = bound[0];
        int upperBound = bound[1];
        List<Integer> list = new ArrayList<>();

        for (int i = lowerBound; i <= upperBound; i++) {
            list.add(i);
        }

        String command = scanner.nextLine();
        Predicate<Integer> predicateOdd = n -> n % 2 != 0;
        Predicate<Integer> predicateEven = n -> n % 2 == 0;

        if (command.equals("odd")) {
            list.stream().filter(predicateOdd).forEach(n -> System.out.print(n + " "));
        } else {
            list.stream().filter(predicateEven).forEach(n -> System.out.print(n + " "));
        }
    }
}