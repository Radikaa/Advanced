package P06_Lab_Constructors;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countofLine = Integer.parseInt(scanner.nextLine());
        List<Constructors> constructorsList = new ArrayList<>();

        for (int i = 1; i <= countofLine; i++) {
            Constructors currentConstructor;
            String[] inputArr = scanner.nextLine().split(" ");
            if (inputArr.length > 1) {
                currentConstructor = new Constructors(inputArr[0], inputArr[1], Integer.parseInt(inputArr[2]));
            } else {
                currentConstructor = new Constructors(inputArr[0]);
            }
            constructorsList.add(currentConstructor);
        }
        constructorsList.forEach(item -> System.out.printf("The car is: %s %s - %d HP.%n", item.getBrand(), item.getModel(), item.getHP()));
    }
}