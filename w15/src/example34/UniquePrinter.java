package example34;

import java.util.ArrayList;
import java.util.Collection;

public class UniquePrinter {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(1.0);
        list.add(1.0);
        printUnique(list);
    }

    public static <T> void printUnique(Collection<T> items) {
        for (T currentItem : items) {
            boolean isUnique = true;
            for (T otherItem : items) {
                if (currentItem.equals(otherItem) && currentItem != otherItem) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(currentItem);
            }
        }
    }
}