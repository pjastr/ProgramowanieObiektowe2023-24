public class TestVehicle {

    public static void main(String[] args) {
        // Użycie konstruktorów:
        Vehicle vehicle1 = new Vehicle(); // używa konstruktora domyślnego
        Vehicle vehicle2 = new Vehicle("Toyota"); // używa konstruktora z jednym argumentem
        Vehicle vehicle3 = new Vehicle("Honda", 2); // używa konstruktora z dwoma argumentami
    }
}

class Vehicle {

    private String brand;
    private int wheels;

    // Konstruktor domyślny (bezargumentowy)
    public Vehicle() {
        this.brand = "Unknown";
        this.wheels = 4;
    }

    // Konstruktor z jednym argumentem
    public Vehicle(String brand) {
        this.brand = brand;
        this.wheels = 4;
    }

    // Konstruktor z dwoma argumentami
    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

}