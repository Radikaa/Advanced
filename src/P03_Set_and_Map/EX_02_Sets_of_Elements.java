package P03_Set_and_Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class EX_02_Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensionsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashSet<Integer> nSet = new LinkedHashSet<>();
        HashSet<Integer> mSet = new LinkedHashSet<>();

        for (int i = 0; i < dimensionsArr[0]; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            nSet.add(digit);
        }

        for (int i = 0; i < dimensionsArr[1]; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            mSet.add(digit);
        }
        nSet.retainAll(mSet);

        for (Integer integer : nSet) {
            System.out.print(integer + " ");
        }
    }
}