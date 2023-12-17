package example9;

import java.util.Comparator;

public class HoursComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        return o1.getHours() - o2.getHours();
    }
}
