package example25;

import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        Integer[] numbers = {1, -2, 33, 76, 5};
        System.out.println(max(Arrays.asList(numbers)));
        LinkedList<String> strings = new LinkedList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        System.out.println(max(strings));
    }

    public static <T extends Comparable<T>> T max(Collection<T> c) {
        if (c == null || c.isEmpty()) {
            throw new NoSuchElementException("Collection is null or empty");
        }
        Iterator<T> iterator = c.iterator();
        T largest = iterator.next();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (largest.compareTo(next) < 0) {
                largest = next;
            }
        }
        return largest;
    }
}
