package example6;

import java.util.*;

public class Test6 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        Collections.sort(list);
        System.out.println(list);
        List<String> words = Arrays.asList("apple", "orange333333333333", "banana");
        words.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(words);
        List<String> words2 = Arrays.asList("apple", "3orange", "banana");
        words2.sort(null);
        System.out.println(words2);
        words2.sort(Comparator.naturalOrder());
        System.out.println(words2);
        words2.sort(String::compareTo);
        System.out.println(words2);
    }
}
