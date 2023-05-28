package P05_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class EX_03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<int[], Integer> function = arr -> {
            int minDigit = Integer.MAX_VALUE;
            for (int digit : inputArr) {
                if (digit < minDigit) {
                    minDigit = digit;
                }
            }
            return minDigit;
        };
        int minDigitForPirnt = function.apply(inputArr);
        System.out.println(minDigitForPirnt);
    }
}