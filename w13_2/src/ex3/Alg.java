package ex3;

public class Alg {

    public static void main(String[] args) {
        Integer[] tab = {5,6, -33, 67};
        System.out.println(maxValue(tab));
     }

    public static <T extends Comparable<T>> T maxValue(T[] array){
        if (array == null || array.length ==0)
            throw  new IllegalArgumentException("Bledny");
        T temp = array[0];
        for(T elem: array){
            if (temp.compareTo(elem) <0)
            {
                temp = elem;
            }
        }
        return temp;
    }
}
