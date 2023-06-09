package P03_Set_and_Map;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_09_Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());

        for (int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i) + " ");
            if (i == 2) {
                break;
            }
        }
    }
}