package P06_EX_Opinion_Poll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOFLine = Integer.parseInt(scanner.nextLine());
        List<Person> list = new ArrayList<>();
        for (int i = 1; i <= countOFLine; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            Person person = new Person(inputArr[0], Integer.parseInt(inputArr[1]));
            list.add(person);
        }
        list.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(Person::getName))
                .forEach(person -> System.out.printf("%s - %d%n", person.getName(), person.getAge()));
    }
}