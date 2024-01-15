package example26;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Tworzenie trzech różnych LinkedList
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Double> list3 = new LinkedList<>();

        // Dodawanie elementów
        list1.add("Jabłko");
        list1.add("Banana");
        list2.add(1);
        list2.add(2);
        list3.add(1.1);
        list3.add(2.2);

        // Dodawanie na początku i na końcu
        list1.addFirst("Pomarańcza");
        list1.addLast("Gruszka");

        // Usuwanie elementów
        list2.removeFirst();
        list2.removeLast();

        // Pobieranie i ustawianie wartości
        String firstItem = list1.getFirst();
        list1.set(1, "Kokos");

        // Rozmiar listy
        int size1 = list1.size();
        int size2 = list2.size();

        // Sprawdzanie czy lista zawiera element
        boolean containsApple = list1.contains("Jabłko");

        // Iteracja przez listę
        for(String item : list1) {
            System.out.println(item);
        }
    }
}
