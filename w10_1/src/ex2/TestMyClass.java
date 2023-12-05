package ex2;

public class TestMyClass {

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        m1.method();
        System.out.println(m1.foo(7));
        System.out.println(m1.foo("ABCabc"));
        InterfaceB m2 = new MyClass();
        m2.method();
        System.out.println(m2.foo("abc"));
    }
}
