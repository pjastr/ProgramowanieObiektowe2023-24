package example10;

import java.util.Comparator;

public class Engine implements Comparable<Engine> {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public String toString() {
        return "Engine: " + type;
    }

    @Override
    public int compareTo(Engine obj) {
        return this.type.compareTo(obj.getType());
    }
}
