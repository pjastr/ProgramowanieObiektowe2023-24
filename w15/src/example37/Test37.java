package example37;

import java.util.TreeSet;

public class Test37 {

    public static void main(String[] args) {
        Alg a1 = new Alg();
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(33);
        treeSet.add(4);
        treeSet.add(-5);
        System.out.println(treeSet);
        System.out.println(a1.findElementsInRange(treeSet, 1, 5));
    }

}
