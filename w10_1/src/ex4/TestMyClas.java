package ex4;

import ex4.InterfaceB;

public class TestMyClas {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        InterfaceB m2 = new MyClass();
        m2.methodA(4,5);
    }
}
