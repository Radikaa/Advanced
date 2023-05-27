package P03_Set_and_Map;

import java.util.*;

public class EX_07_Hands_Of_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String name = "";
        String powerOfCard = "";
        String typeOfCard = "";
        Map<String, List<String>> map = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> maps = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] inputArr = input.split(": ");
            String[] cards = inputArr[1].split(", ");
            name = inputArr[0];
            map.putIfAbsent(name, new ArrayList<>());
            maps.putIfAbsent(name, new LinkedHashMap<>());

            for (String card : cards) {
                if (!map.get(name).contains(card)) {
                    map.get(name).add(card);
                }
            }

            for (String card : cards) {
                if (!maps.get(name).containsValue(card)) {
                   // map.get(name).get(card);
                }


                if (!map.get(name).contains(card)) {
                    map.get(name).add(card);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String names : map.keySet()) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    var types = Arrays.stream(entry.getValue().toArray()).toArray();
                    //char power = types[0];


                }

            }

        }


    }


    int sum = 1;


}