package example38;

import java.util.HashMap;

public class Test38 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("c", 1);
        map.put("d", 2);
        map.put("e", 1);
        map.put("a", 1);
        map.put("b", 2);

        System.out.println(map);
        System.out.println(countValueOccurrences(map));
    }

    public static <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        HashMap<V, Integer> result = new HashMap<>();
        for (V value : map.values()) {
            int count = 0;
            for (V value2 : map.values()) {
                if (value.equals(value2)) {
                    count++;
                }
            }
            result.put(value, count);
        }
        return result;
    }
}
