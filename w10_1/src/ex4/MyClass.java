package ex4;

public class MyClass implements InterfaceB {
    @Override
    public int methodB(String arg) {
        return arg.length();
    }

    @Override
    public int methodA(int arg1, int arg2) {
        return arg1+arg2;
    }
}
