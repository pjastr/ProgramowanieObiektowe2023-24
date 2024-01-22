package example37;

import java.util.TreeSet;

public class Alg {

    public <T extends Comparable<T>> TreeSet<T> findElementsInRange(TreeSet<T> treeSet, T lowerBound, T upperBound) {
        TreeSet<T> result = new TreeSet<>();
        for (T element : treeSet) {
            if (element.compareTo(lowerBound) >= 0 && element.compareTo(upperBound) <= 0) {
                result.add(element);
            }
        }
        return result;
    }
}
