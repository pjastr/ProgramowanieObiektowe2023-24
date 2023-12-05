public interface Vehicle {
    void drive();

    int foo(int a);

    // Metoda domyślna
    default void turnOnLights() {
        System.out.println("Światła włączone.");
    }

    // Metoda statyczna
    static void horn() {
        System.out.println("Trąbienie!");
    }
}



