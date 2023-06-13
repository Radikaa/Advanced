package P05_Functional_Programming;

import java.util.*;
import java.util.stream.Collectors;

public class EX_05_Reverse_and_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int divisibleDigit = Integer.parseInt(scanner.nextLine());
        Collections.reverse(list);
        list.stream().filter(n->n%divisibleDigit!=0).forEach(n-> System.out.print(n + " "));
    }
}