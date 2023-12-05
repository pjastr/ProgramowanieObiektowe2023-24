package ex1;

public class MyClass implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("A");
    }

    @Override
    public void methodB() {
        System.out.println("B");
    }

    public void methodC(){
        System.out.println("C");
    }
}
