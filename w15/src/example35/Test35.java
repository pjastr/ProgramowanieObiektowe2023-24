package example35;

import java.util.LinkedList;

public class Test35 {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("John");
        list1.add("Sue");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("John");
        list2.add("Jane");
        list2.add("Adam");
        LinkedList<String> commonElements = findCommonElements(list1, list2);
        System.out.println(commonElements);

    }

    public static <T> LinkedList<T> findCommonElements(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> commonElements = new LinkedList<>();
        for (T item : list1) {
            if (list2.contains(item) && !commonElements.contains(item)) {
                commonElements.add(item);
            }
        }
        return commonElements;
    }
}
