package P05_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_01_Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        System.out.println(list.stream().sorted().map(String::valueOf).collect(Collectors.joining(", ")));
    }
}
