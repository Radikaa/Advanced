package magazine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Magazine {
    public String type;
    public int capacity;
    public List<Cloth> data = new ArrayList<>();

    public Magazine(String type, int capacity, List<Cloth> data) {
        this.type = type;
        this.capacity = capacity;
        this.data = data;
    }

    public void addCloth(Cloth cloth) {
        if (data.size() < capacity) {
            data.add(cloth);
        }
    }

    public boolean removeCloth(String color) {
        Cloth cloth = this.getCloth(color);
        data.remove(cloth);
        return cloth != null;
    }
    public Cloth getSmallestCloth() {
        return data.stream().min(Comparator.comparing(Cloth::getSize)).orElse(null);
    }

    public Cloth getCloth(String color){
        return data.stream().filter(e -> e.getColor().equals(color)).findFirst().orElse(null);
    }

    public int getCount(){
        return data.size();
    }

    public String report(){

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s magazine contains:%n", type)).trimToSize();

        data.forEach(egg -> sb.append(egg.toString()).append(String.format("%n")));

        return sb.toString().trim();
    }
}
