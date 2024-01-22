package example36;

import java.util.HashSet;

public class Test36 {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 = null;
        System.out.println(hasCommonElements(set1, set2));
        HashSet<Student> h1 = new HashSet<>();
        h1.add(new Student("Krzysztof", 4.0));
        h1.add(new Student("Anna", 4.5));
        h1.add(new Student("Krzysztof", 4.0));
        h1.add(new Student("Anna", 4.5));
        System.out.println(h1);
        HashSet<Student> h2 = new HashSet<>();
        h2.add(new Student("Olga", 3.0));
        h2.add(new Student("Krzysztof", 4.0));
        System.out.println(h2);
        System.out.println(hasCommonElements(h1, h2));
    }

    public static <T> boolean hasCommonElements(HashSet<T> set1, HashSet<T> set2) {
        if (set1 == null || set2 == null)
            return false;
        for (T element : set1) {
            if (set2.contains(element)) {
                return true;
            }
        }
        return false;
    }
}