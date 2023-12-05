package ex5;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        int[] intArray = {5, 2, 8, -3, 1};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        double[] doubleArray = {3.14, -1.59, 2.65, 3.58};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        String[] stringArray = {"Banana", "apple", "Cherry", "Date"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}
