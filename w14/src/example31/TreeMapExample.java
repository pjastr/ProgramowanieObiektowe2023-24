package example31;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Tworzenie TreeMap
        TreeMap<String, Integer> fruitMap = new TreeMap<>();
        TreeMap<Integer, String> reverseMap = new TreeMap<>();

        // Dodawanie elementów
        fruitMap.put("Jabłko", 50);
        fruitMap.put("Banana", 20);
        fruitMap.put("Pomarańcza", 30);
        reverseMap.put(1, "Poniedziałek");
        reverseMap.put(2, "Wtorek");
        reverseMap.put(3, "Środa");

        // Pobieranie pierwszego i ostatniego klucza
        String firstKey = fruitMap.firstKey();
        Integer lastKey = reverseMap.lastKey();

        // Sprawdzanie obecności klucza
        boolean hasApple = fruitMap.containsKey("Jabłko");

        // Usuwanie elementu
        fruitMap.remove("Banana");

        // Pobieranie i ustawianie wartości
        Integer appleCount = fruitMap.get("Jabłko");
        reverseMap.put(3, "Środa");

        // Iteracja przez mapę
        for (String key : fruitMap.keySet()) {
            System.out.println(key + " -> " + fruitMap.get(key));
        }

        // Pobieranie podmapy
        TreeMap<String, Integer> subMap = new TreeMap<>(fruitMap.subMap("Jabłko", true, "Pomarańcza", true));

        // Czyszczenie mapy
        reverseMap.clear();

        // Utworzenie TreeMap z odwróconym porównywaniem dla kluczy
        TreeMap<String, Double> reverseOrderMap = new TreeMap<>(Comparator.reverseOrder());

        // Dodanie elementów do TreeMap
        reverseOrderMap.put("Alfa", 1.5);
        reverseOrderMap.put("Bravo", 2.5);
        reverseOrderMap.put("Charlie", 3.5);
        reverseOrderMap.put("Delta", 4.5);

        // Wyświetlenie elementów w odwróconym porządku kluczy
        System.out.println("Elementy TreeMap w odwróconym porządku kluczy:");
        reverseOrderMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

