package ex3;

public class TestMy {

    public static void main(String[] args) {
        My m1 = new My();
        m1.metoda();
        InterfaceA m2 = new My();
        m2.metoda();
        InterfaceB m3 = new My();
        m3.metoda();
    }
}
