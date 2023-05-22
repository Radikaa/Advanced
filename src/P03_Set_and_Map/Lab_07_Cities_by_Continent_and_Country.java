package P03_Set_and_Map;

import java.util.*;

public class Lab_07_Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();

        for (int i = 1; i <= count; i++) {
            String[] input = scanner.nextLine().split(" ");
            String continents = input[0];
            String countries = input[1];
            String cities = input[2];

            map.putIfAbsent(continents, new LinkedHashMap<>());
            map.get(continents).putIfAbsent(countries, new ArrayList<>());
            map.get(continents).get(countries).add(cities);
        }

        for (Map.Entry<String, Map<String, List<String>>> entry : map.entrySet()) {
            System.out.printf("%s:%n", entry.getKey());
            for (Map.Entry<String, List<String>> country : map.get(entry.getKey()).entrySet()) {
                System.out.printf("%s -> %s%n", country.getKey(), String.join(", ", country.getValue()));
            }
        }
    }
}