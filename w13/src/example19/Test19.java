package example19;

public class Test19 {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        print(intArray);
        print(doubleArray);
        print(charArray);
    }

    public static <T> void print(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
