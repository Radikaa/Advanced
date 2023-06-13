package P05_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EX_07_Find_The_Smallest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> function = n -> {
            int minDigit = Integer.MAX_VALUE;
            int inddexOfDigit = -1;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= minDigit) {
                    minDigit = numbers.get(i);
                    inddexOfDigit = i;
                }
            }
            return inddexOfDigit;
        };
        System.out.println(function.apply(numbers));
    }
}
