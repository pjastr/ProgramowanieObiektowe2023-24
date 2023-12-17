package example8;

import java.util.Comparator;

class TwoCondComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int base = o1.getName().compareTo(o2.getName());
        if (base != 0) {
            return base;
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
