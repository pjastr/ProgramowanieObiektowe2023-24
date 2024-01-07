package example29;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Tworzenie HashMap
        HashMap<String, Integer> fruitMap = new HashMap<>();
        HashMap<Integer, String> reverseMap = new HashMap<>();

        // Dodawanie elementów
        fruitMap.put("Jabłko", 10);
        fruitMap.put("Banana", 20);
        reverseMap.put(1, "Jeden");
        reverseMap.put(2, "Dwa");

        // Pobieranie wartości
        Integer appleCount = fruitMap.get("Jabłko");
        String numberTwo = reverseMap.get(2);

        // Sprawdzanie obecności klucza lub wartości
        boolean hasBanana = fruitMap.containsKey("Banana");
        boolean hasTwenty = reverseMap.containsValue("Dwa");

        // Usuwanie elementu
        fruitMap.remove("Banana");

        // Iteracja przez mapę
        for (String key : fruitMap.keySet()) {
            System.out.println(key + " -> " + fruitMap.get(key));
        }

        // Pobieranie liczby elementów
        int size = reverseMap.size();

        // Czyszczenie mapy
        reverseMap.clear();
    }
}

