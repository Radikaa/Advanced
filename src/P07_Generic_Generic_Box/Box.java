package P07_Generic_Generic_Box;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<String> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public List<String> getValues() { 
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return String.join(", ", values);
    }
}