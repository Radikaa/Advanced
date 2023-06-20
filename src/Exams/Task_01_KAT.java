package Exams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task_01_KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queueLicense = new ArrayDeque<>();
        ArrayDeque<Integer> stackCars = new ArrayDeque<>();
        //Queue- offer, poll, peek
        //Stack - push, pop, peek
        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).forEach(queueLicense::offer);
        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).forEach(stackCars::push);

        int dayCount = 0;
        int registeredCars = 0;

        while (queueLicense.size() > 0 && stackCars.size() > 0) {
            dayCount++;
            int currentNumberOfPlate = queueLicense.poll();
            int currentNumberOfCars = stackCars.pop();

            if (currentNumberOfPlate > (currentNumberOfCars * 2)) {
                queueLicense.addLast(currentNumberOfPlate - (currentNumberOfCars * 2));
                registeredCars += currentNumberOfCars;
            } else if (currentNumberOfPlate < (currentNumberOfCars * 2)) {
                int leftCars = currentNumberOfCars - (currentNumberOfPlate / 2);
                stackCars.addLast(leftCars);
                registeredCars += (currentNumberOfPlate / 2);
            } else {
                registeredCars += currentNumberOfCars;
            }
        }
        System.out.printf("%d cars were registered for %d days!%n", registeredCars, dayCount);
        if (!queueLicense.isEmpty()) {
            long sumOfUnplacedPlates = 0;
            while (!queueLicense.isEmpty()) {
                sumOfUnplacedPlates += queueLicense.poll();
            }
            System.out.printf("%d license plates remain!", sumOfUnplacedPlates);
        } else if (!stackCars.isEmpty()) {
            long sumOfCarsWithoutPlate = 0;
            while (!stackCars.isEmpty()) {
                sumOfCarsWithoutPlate += stackCars.pop();
            }
            System.out.printf("%d cars remain without license plates!", sumOfCarsWithoutPlate);
        } else {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
    }
}