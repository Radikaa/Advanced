package P03_Set_and_Map;

import java.text.DecimalFormat;
import java.util.*;

public class Lab_08_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new TreeMap<>();

        for (int i = 1; i <= numberOfStudents; i++) {
            String name = scanner.nextLine();
            double[] graduatsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            map.putIfAbsent(name, new ArrayList<>());
            for (int j = 0; j < graduatsArr.length; j++) {
                map.get(name).add(graduatsArr[j]);
            }
        }

        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }
            double avvGrade = sum / entry.getValue().size();
            DecimalFormat decimalFormat = new DecimalFormat("#.##################");
            System.out.printf("%s is graduated with %s%n", entry.getKey(), decimalFormat.format(avvGrade));
        }
    }
}