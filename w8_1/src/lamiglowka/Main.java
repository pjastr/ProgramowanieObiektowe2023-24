package lamiglowka;

public class Main {

    public static void main(String[] args) {
        A obj = new C();
        obj.normal();
        obj.virt1();
        obj.virt2();
    }
}


class A {
    public void normal() {
        System.out.println("A.Normal()");
    }

    public void virt1() {
        System.out.println("A.Virt1()");
        virt2();
    }

    public void virt2() {
        System.out.println("A.Virt2()");
    }
}

class B extends A {
    public void normal() {
        System.out.println("B.Normal()");
    }

    public void virt1() {
        System.out.println("B.Virt1()");
    }

    @Override
    public void virt2() {
        System.out.println("B.Virt2()");
    }
}

class C extends B {
    @Override
    public void virt1() {
        System.out.println("C.Virt1()");
    }
}

class D extends C {
    public void normal() {
        System.out.println("D.Normal()");
    }

    @Override
    public void virt1() {
        System.out.println("D.Virt1()");
    }

    @Override
    public void virt2() {
        System.out.println("D.Virt2()");
    }
}

abstract class E extends D {
    public void virt1() {
        System.out.println("E.Virt1()");
    }

    public abstract void virt2();
}

class F extends E {
    @Override
    public void virt1() {
        System.out.println("F.Virt1()");
    }

    @Override
    public void virt2() {
        System.out.println("F.Virt2()");
    }
}
