package example18;

// //Cay S. Horstmann, Java. Podstawy. Wydanie XII , Wyd. Helion, 2021.
public class ArrayAlg {

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}
