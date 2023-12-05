package finalnaklasa;

import java.util.List;
import java.util.ArrayList;

public final class MyImmutableClass {
    private final int value;
    private final String name;
    private final ArrayList<String> items;

    public MyImmutableClass(int value, String name, ArrayList<String> items) {
        this.value = value;
        this.name = name;
        this.items = new ArrayList<>(items); // Tworzenie kopii listy
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getItems() {
        return new ArrayList<>(items); // Zwraca kopię listy, a nie oryginał
    }

    @Override
    public String toString() {
        return "MyImmutableClass{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
