package example33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class UniquePrinter {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("John");
        names.add("John");
        printUnique(names.iterator());
    }

    public static <T> void printUnique(Iterator<T> items) {
        HashSet<T> uniqueItems = new HashSet<>();

        while (items.hasNext()) {
            T item = items.next();
            if (uniqueItems.add(item)) {
                System.out.println(item);
            }
        }
    }
}
