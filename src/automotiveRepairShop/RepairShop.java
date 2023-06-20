package automotiveRepairShop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RepairShop {

    private int capacity;
    private List<Vehicle> vehicles;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (this.vehicles.size() < this.capacity) {
            this.vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String vin) {
        for (int i = 0; i < this.vehicles.size(); i++) {
            if (this.vehicles.get(i).getVIN().equals(vin)) {
                this.vehicles.remove(i);
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return this.vehicles.size();
    }

    public Vehicle getLowestMileage() {
        return this.vehicles.stream().min(Comparator.comparingInt(Vehicle::getMileage)).get();
    }

    public String report() {
        StringBuilder sb = new StringBuilder("Vehicles in the preparatory:");
        for (Vehicle vehicle : vehicles) {
            sb.append(System.lineSeparator());
            sb.append(vehicle);
        }
        return sb.toString();
    }
}