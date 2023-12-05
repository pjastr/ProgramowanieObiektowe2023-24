package ex2;

import java.awt.*;

public class MyClass implements InterfaceA, InterfaceB{


    public void methodC(){
        System.out.println("C");
    }

    @Override
    public void method() {
        System.out.println("Met");
    }

    @Override
    public String foo(String arg) {
        return arg.replace("a", "A");
    }

    @Override
    public int foo(int arg) {
        return arg * arg;
    }
}
