package example18;

public class TestArrayAlg {

    public static void main(String[] args) {
        String[] words = {"ABC", "DEF", "GHI", "JKL", "MNO"};
        String middle = ArrayAlg.getMiddle(words);
        System.out.println(middle);
        Integer[] numbers = {1, -2, 7, 8, 12};
        Integer middle2 = ArrayAlg.getMiddle(numbers);
        System.out.println(middle2);
        System.out.println(ArrayAlg.getMiddle("ABC", "DEF", "GHI"));
        System.out.println(ArrayAlg.getMiddle(3.4, 177.0, 3.14, -5.6, 177.1));
    }
}
