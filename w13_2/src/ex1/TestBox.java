package ex1;

import java.util.ArrayList;

public class TestBox {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Box<Integer> b1 = new Box<>(5);
        System.out.println(b1.get());
    }
}
