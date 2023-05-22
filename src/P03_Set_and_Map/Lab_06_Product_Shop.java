package P03_Set_and_Map;

import java.util.*;

public class Lab_06_Product_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Double>> map = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] inputArr = input.split(", ");
            String shop = inputArr[0];
            String product = inputArr[1];
            double price = Double.parseDouble(inputArr[2]);

            map.putIfAbsent(shop, new LinkedHashMap<>());
            map.get(shop).put(product, price);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> entry : map.entrySet()) {
            System.out.printf("%s->%n", entry.getKey());
            for (Map.Entry<String, Double> products : map.get(entry.getKey()).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", products.getKey(), products.getValue());
            }
        }
    }
}