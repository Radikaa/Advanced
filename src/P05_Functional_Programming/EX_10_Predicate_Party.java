package P05_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EX_10_Predicate_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> comingNames = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String[] inputArr = input.split(" ");
            String command = inputArr[0];
            String typeOfCommand = inputArr[1];
            String lastCommandInfo = inputArr[2];

            if (command.equals("Remove")) {
                if (typeOfCommand.equals("StartsWith")) {
                    Predicate<String> predicateStarts = n -> !n.startsWith(lastCommandInfo);
                    comingNames = comingNames.stream().filter(predicateStarts).collect(Collectors.toList());
                } else if (typeOfCommand.equals("EndsWith")) {
                    Predicate<String> predicateEnding = n -> !n.endsWith(lastCommandInfo);
                    comingNames = comingNames.stream().filter(predicateEnding).collect(Collectors.toList());
                } else if (typeOfCommand.equals("Length")) {
                    Predicate<String> predicateLenght = n -> n.length() == Integer.parseInt(lastCommandInfo);
                    comingNames = comingNames.stream().filter(predicateLenght).collect(Collectors.toList());
                }
            } else if (!command.equals("Double")) {
                if (typeOfCommand.equals("StartsWith")) {
                    Predicate<String> predicateStarts = n -> n.startsWith(lastCommandInfo);
                    List<String> currentList = comingNames.stream().filter(predicateStarts).collect(Collectors.toList());
                    for (int i = 0; i < currentList.size(); i++) {
                        comingNames.add(comingNames.indexOf(currentList.get(i)), currentList.get(i));
                    }
                } else if (typeOfCommand.equals("EndsWith")) {
                    Predicate<String> predicateEnding = n -> n.endsWith(lastCommandInfo);
                    List<String> currentListTwo = comingNames.stream().filter(predicateEnding).collect(Collectors.toList());
                    for (int i = 0; i < currentListTwo.size(); i++) {
                        comingNames.add(comingNames.indexOf(currentListTwo.get(i)), currentListTwo.get(i));
                    }
                } else if (typeOfCommand.equals("Length")) {
                    Predicate<String> predicateLenght = n -> n.length() == Integer.parseInt(lastCommandInfo);
                    List<String> currentListThree = comingNames.stream().filter(predicateLenght).collect(Collectors.toList());
                    for (int i = 0; i < currentListThree.size(); i++) {
                        comingNames.add(comingNames.indexOf(currentListThree.get(i)), currentListThree.get(i));
                    }
                }
            }
            input = scanner.nextLine();
        }
        Collections.sort(comingNames);
        if (!comingNames.isEmpty()) {
            System.out.println(String.join(", ", comingNames) + " are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
}