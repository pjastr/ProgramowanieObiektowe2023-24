package example28;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Tworzenie TreeSet
        TreeSet<String> stringSet = new TreeSet<>();
        TreeSet<Integer> intSet = new TreeSet<>();

        // Dodawanie elementów
        stringSet.add("Jabłko");
        stringSet.add("Banana");
        intSet.add(1);
        intSet.add(2);

        // Sprawdzanie, czy zbiór zawiera element
        boolean containsBanana = stringSet.contains("Banana");

        // Pobieranie pierwszego i ostatniego elementu
        String firstString = stringSet.first();
        Integer lastInt = intSet.last();

        // Usuwanie elementów
        stringSet.remove("Jabłko");
        intSet.pollFirst();

        // Pobieranie podzbioru
        TreeSet<Integer> subSet = new TreeSet<>(intSet.subSet(1, true, 3, false));

        // Iteracja przez zbiór
        for(String s : stringSet) {
            System.out.println(s);
        }

        // Czyszczenie zbioru
        intSet.clear();
    }
}
