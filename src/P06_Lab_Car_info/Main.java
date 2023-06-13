package P06_Lab_Car_info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfCar = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 1; i <= countOfCar; i++) {
            String[] dataCars = scanner.nextLine().split(" ");
            Car currentCar = new Car(dataCars[0], dataCars[1], Integer.parseInt(dataCars[2]));
            cars.add(currentCar);
        }
        cars.stream().forEach(car -> System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(), car.getModel(), car.getHorsePower()));
    }
}