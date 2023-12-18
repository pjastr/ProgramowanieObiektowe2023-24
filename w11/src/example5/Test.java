package example5;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println("Case1:");
        Integer[] array = {3, 1, 4, 1, 5, 9}; // nie działa zwykły int
        Arrays.sort(array, (a, b) -> a - b);
        System.out.println(Arrays.toString(array));
        System.out.println("Case2:");
        String[] words = {"applerrrrrrrrrrrr", "orange", "banana"};
        Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(words));
        System.out.println("Case3:");
        Arrays.sort(array, (a, b) -> b - a);
        System.out.println(Arrays.toString(array));

    }
}
