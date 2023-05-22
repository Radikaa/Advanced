package P03_Set_and_Map;

import java.util.*;

public class Lab_05_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> map = new TreeMap<>();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String name = inputArr[0];
            double grade = Double.parseDouble(inputArr[1]);

            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(grade);
        }

        for (var students : map.entrySet()) {
            String student = students.getKey();
            double sum = 0;
            System.out.printf("%s -> ", student);
            for (int i = 0; i < students.getValue().size(); i++) {
                sum += students.getValue().get(i);
                System.out.printf("%.2f ", students.getValue().get(i));
            }
            double avvGrades = sum / students.getValue().size();
            System.out.printf("(avg: %.2f)%n", avvGrades);
        }
    }
}
