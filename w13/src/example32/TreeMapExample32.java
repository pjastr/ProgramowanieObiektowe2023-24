package example32;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample32 {
    public static void main(String[] args) {
        TreeMap<String, Double> prices = new TreeMap<>();

        // Dodawanie par klucz-wartość
        prices.put("Apple", 1.99);
        prices.put("Banana", 0.49);
        prices.put("Cherry", 2.99);
        prices.put("Date", 3.49);
        prices.put("Elderberry", 1.79);
        prices.put("Fig", 2.09);

        // Użycie metody ceilingEntry
        Map.Entry<String, Double> ceiling = prices.ceilingEntry("Cantaloupe");

        // Użycie metody firstEntry
        Map.Entry<String, Double> first = prices.firstEntry();

        // Użycie metody higherEntry
        Map.Entry<String, Double> higher = prices.higherEntry("Cherry");

        // Użycie metody lowerEntry
        Map.Entry<String, Double> lower = prices.lowerEntry("Date");

        // Wyświetlanie wyników
        System.out.println("Ceiling Entry: " + ceiling.getKey() + " -> " + ceiling.getValue());
        System.out.println("First Entry: " + first.getKey() + " -> " + first.getValue());
        System.out.println("Higher Entry: " + higher.getKey() + " -> " + higher.getValue());
        System.out.println("Lower Entry: " + lower.getKey() + " -> " + lower.getValue());
    }
}
