package P03_Set_and_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Lab_01_Parking_lot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashSet<String> parking = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] inputArr = input.split(", ");
            String inOrOut = inputArr[0];
            String car = inputArr[1];

            if (inOrOut.equals("IN")) {
                parking.add(car);
            } else {
                parking.remove(car);
            }
            input = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parking) {
                System.out.println(car);
            }
        }
    }
}