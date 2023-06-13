package P06_Lab_Constructors;

public class Constructors {
    private String brand;
    private String model;
    int HP;

    public Constructors(String brand, String model, int HP) {
        this.brand = brand;
        this.model = model;
        this.HP = HP;
    }

    public Constructors(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.HP = -1;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
