public class TestSingleton {
    public static void main(String[] args) {
        // Pobranie instancji Singleton
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
    }
}

class Singleton {

    // Jedyna instancja tej klasy
    private static Singleton instance;

    // Prywatny konstruktor
    private Singleton() {
        // inicjalizacja
    }

    // Publiczna metoda dostępowa do instancji
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}