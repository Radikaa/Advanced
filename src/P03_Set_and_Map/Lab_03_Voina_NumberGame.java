package P03_Set_and_Map;

import java.util.*;
import java.util.stream.Collectors;

public class Lab_03_Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).
                collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).
                collect(Collectors.toCollection(LinkedHashSet::new));

        int count = 50;
        while (count-- > 0) {
            int firstPlayerHand = firstPlayerDeck.iterator().next();
            firstPlayerDeck.remove(firstPlayerHand);
            int secondPlayerHand = secondPlayerDeck.iterator().next();
            secondPlayerDeck.remove(secondPlayerHand);

            if (firstPlayerHand > secondPlayerHand) {
                firstPlayerDeck.add(secondPlayerHand);
                firstPlayerDeck.add(firstPlayerHand);

            } else if (firstPlayerHand < secondPlayerHand) {
                secondPlayerDeck.add(secondPlayerHand);
                secondPlayerDeck.add(firstPlayerHand);
            }

            if (firstPlayerDeck.isEmpty() || secondPlayerDeck.isEmpty()) {
                break;
            }
        }

        if (firstPlayerDeck.size() > secondPlayerDeck.size()) {
            System.out.println("First player win!");
        } else if (firstPlayerDeck.size() < secondPlayerDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}