package ex2;

import java.util.Arrays;

public class TestMyString {

    public static void main(String[] args) {
        MyString[] strings = new MyString[3];
        strings[0] = new MyString("ąello");
        strings[1] = new MyString("world");
        strings[2] = new MyString("Java");
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}