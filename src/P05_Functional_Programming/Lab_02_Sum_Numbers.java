package P05_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lab_02_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], String> count = digit -> "Count = " + Arrays.stream(digit).count();
        Function<int[], String> sum = digit -> "Sum = " + Arrays.stream(digit).sum();

        int[] inputArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(count.apply(inputArr));
        System.out.println(sum.apply(inputArr));
    }
}