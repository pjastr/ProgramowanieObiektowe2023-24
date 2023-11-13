public class TestLaptop {

    public static void main(String[] args) {
        // Użycie konstruktorów:
        Laptop laptop1 = new Laptop("Dell"); // używa konstruktora z jednym argumentem
        Laptop laptop2 = new Laptop("Apple", 16); // używa konstruktora z dwoma argumentami
    }
}


class Laptop {

    private String brand;
    private int memory;
    private boolean hasSSD;

    // Konstruktor główny
    public Laptop(String brand, int memory, boolean hasSSD) {
        this.brand = brand;
        this.memory = memory;
        this.hasSSD = hasSSD;
    }

    // Konstruktor z jednym argumentem - wywołuje konstruktor główny
    public Laptop(String brand) {
        this(brand, 8, true); // Wywołuje konstruktor główny z domyślnymi wartościami dla pamięci i SSD
    }

    // Konstruktor z dwoma argumentami - wywołuje konstruktor główny
    public Laptop(String brand, int memory) {
        this(brand, memory, true); // Wywołuje konstruktor główny z domyślną wartością dla SSD
    }

}