package example9;

import java.util.Arrays;
import java.util.Comparator;

public class TestCourse {

    public static void main(String[] args) {
        Course[] tab = new Course[5];
        tab[0] = new Course("Java", 30);
        tab[1] = new Course("C++", 20);
        tab[2] = new Course("Python", 40);
        tab[3] = new Course("C#", 20);
        tab[4] = new Course("JavaScript", 30);
        System.out.println("Case 1:");
        Arrays.sort(tab, new MyComparator().reversed());
        for(var elem: tab) {
            System.out.println(elem);
        }
        System.out.println("Case 2:");
        Arrays.sort(tab, new NameComparator().thenComparing(new HoursComparator()));
        for(var elem: tab) {
            System.out.println(elem);
        }
        System.out.println("Case 3:");
        tab[0] = null;
        Arrays.sort(tab, Comparator.nullsFirst(new NameComparator()));
        for(var elem: tab) {
            System.out.println(elem);
        }
        System.out.println("Case 4:");
        tab[0] = new Course(null, 30);
        //Arrays.sort(tab, Comparator.nullsFirst(new NameComparator()));
        // posortuj tak, by obiekt z napisem null był pierwszy
        Comparator<String> comp = Comparator.nullsFirst(Comparator.naturalOrder());
        Arrays.sort(tab, Comparator.comparing(Course::getName, comp));
        for(var elem: tab) {
            System.out.println(elem);
        }
        System.out.println("Case 5:");
        tab[0] = null;
        Arrays.sort(tab, Comparator.nullsLast(new NameComparator()));
        for(var elem: tab) {
            System.out.println(elem);
        }

    }
}
