package P06_Lab_Car_info;

public class Car {
    private String Brand;
    private String Model;
    private int HorsePower;

    public Car(String brand, String model, int horsePower) {
        Brand = brand;
        Model = model;
        HorsePower = horsePower;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        this.HorsePower = horsePower;
    }
}