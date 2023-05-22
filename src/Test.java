import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        LinkedHashSet<Integer> mapOne = new LinkedHashSet<>();
        LinkedHashSet<Integer> mapTwo = new LinkedHashSet<>();

        if (firstArr.length == secondArr.length) {
            for (int i = 0; i < firstArr.length; i++) {
                for (int j = 0; j < secondArr.length; j++) {
                    mapOne.add(firstArr[i]);
                    mapTwo.add(secondArr[i]);
                }
            }
        } else {
            for (int i = 0; i < firstArr.length; i++) {
                mapOne.add(firstArr[i]);
            }
            for (int i = 0; i < secondArr.length; i++) {
                mapTwo.add(secondArr[i]);
            }
        }
        for (Integer integer : mapOne) {
            if (mapTwo.contains(integer)) {
                System.out.println(integer);
            }
        }
    }
}