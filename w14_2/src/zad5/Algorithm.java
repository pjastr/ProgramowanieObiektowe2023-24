package zad5;

import java.util.Collection;

public class Algorithm {

    public static <T extends Comparable<T>> T maxValue(T[] array){
        if (array == null || array.length ==0){
            throw new IllegalArgumentException("Tablica jest pusta lub jest nullem");
        }
        T temp = array[0];
        for(var elem: array){
            if (temp.compareTo(elem) <0 ){
                temp = elem;
            }
        }
        return temp;
    }

    public static <T extends Comparable<T>> T maxValue2(Collection<T> array){
        if (array == null || array.isEmpty()){
            throw new IllegalArgumentException("Tablica jest pusta lub jest nullem");
        }
        T temp = array.iterator().next();
        for(var elem: array){
            if (temp.compareTo(elem) <0 ){
                temp = elem;
            }
        }
        return temp;
    }
}
