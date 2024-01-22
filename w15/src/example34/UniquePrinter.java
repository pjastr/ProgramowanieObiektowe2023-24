package example34;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class UniquePrinter {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(1.0);
        list.add(1.0);
        printUnique(list);
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("Jan", 3.5));
        list2.add(new Student("Zofia", 4.5));
        list2.add(new Student("Zofia", 4.5));
        printUnique(list2);
    }

    public static <T> void printUnique(Collection<T> items) {
        HashSet<T> temp = new HashSet<>(items);
        System.out.println(temp);
    }
}