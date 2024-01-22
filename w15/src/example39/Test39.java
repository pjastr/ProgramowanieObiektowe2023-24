package example39;

import java.util.Map;
import java.util.TreeMap;

public class Test39 {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("d", 2);
        map.put("e", 1);
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 1);

        System.out.println(map);
        System.out.println(subMapInRange(map, "b", "d"));
    }

    public static <K extends Comparable<? super K>, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
        TreeMap<K, V> result = new TreeMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            if (key.compareTo(startKey) >= 0 && key.compareTo(endKey) <= 0) {
                result.put(key, entry.getValue());
            }
        }
        return result;
    }
}
