package P05_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Lab_04_Add_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());
        UnaryOperator<Double> addVAT = n -> n * 1.2;
        System.out.println("Prices with VAT:");
        list.forEach(price -> System.out.printf("%.2f%n", addVAT.apply(price)));
    }
}
