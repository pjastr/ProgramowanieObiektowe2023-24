package example9;

import java.util.Comparator;

public class MyComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        int base = o1.getHours() - o2.getHours();
        if (base != 0) {
            return base;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
