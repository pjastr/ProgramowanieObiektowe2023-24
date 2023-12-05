package ex1;

public class TestMyClass {

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        m1.methodA();
        m1.methodB();
        InterfaceB m2 = new MyClass();
        m2.methodB();
    }
}
