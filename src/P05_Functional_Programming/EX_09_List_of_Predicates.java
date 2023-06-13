package P05_Functional_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EX_09_List_of_Predicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endBound = Integer.parseInt(scanner.nextLine());
        List<Integer> numbersToDevide = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> isDivisible = number -> {
            for (Integer digitToDevide : numbersToDevide) {
                if (number % digitToDevide != 0) {
                    return false;
                }
            }
            return true;
        };
        IntStream.rangeClosed(1, endBound).boxed().filter(isDivisible).forEach(number -> System.out.print(number + " "));
    }
}