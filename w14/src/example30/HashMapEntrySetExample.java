package example30;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySetExample {
    public static void main(String[] args) {
        // Pierwsza HashMap
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("Apple", 50);
        prices.put("Orange", 30);
        prices.put("Banana", 20);

        // Druga HashMap
        HashMap<Integer, String> daysOfWeek = new HashMap<>();
        daysOfWeek.put(1, "Monday");
        daysOfWeek.put(2, "Tuesday");
        daysOfWeek.put(3, "Wednesday");

        // Wyświetlanie używając entrySet() dla pierwszej mapy
        for (Map.Entry<String, Integer> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue());
        }

        // Wyświetlanie używając entrySet() dla drugiej mapy
        for (Map.Entry<Integer, String> entry : daysOfWeek.entrySet()) {
            System.out.println("Day " + entry.getKey() + " is " + entry.getValue());
        }
    }
}

