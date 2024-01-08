package example27;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Tworzenie HashSet
        HashSet<String> stringSet = new HashSet<>();
        HashSet<Integer> intSet = new HashSet<>();

        // Dodawanie elementów
        stringSet.add("Jabłko");
        stringSet.add("Banana");
        intSet.add(1);
        intSet.add(2);

        // Sprawdzanie, czy zbiór zawiera element
        boolean containsBanana = stringSet.contains("Banana");

        // Usuwanie elementu
        stringSet.remove("Jabłko");

        // Sprawdzanie, czy zbiór jest pusty
        boolean isEmptyStringSet = stringSet.isEmpty();

        // Pobieranie rozmiaru zbioru
        int sizeIntSet = intSet.size();

        // Iteracja przez zbiór
        for(String s : stringSet) {
            System.out.println(s);
        }

        // Czyszczenie zbioru
        intSet.clear();
    }
}
