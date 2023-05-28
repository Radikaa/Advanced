package P05_Functional_Programming;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lab_03_Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Predicate<String> predicate = text -> Character.isUpperCase(text.charAt(0));
        ArrayDeque<String> queue = new ArrayDeque<>();
        list.stream().filter(predicate).forEach(queue::offer);
        System.out.println(queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}