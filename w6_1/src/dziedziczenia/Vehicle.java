package dziedziczenia;

class Vehicle {
    private String brand;

    // Konstruktor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Metoda do wyświetlania informacji o marce
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    // Metoda do symulacji jazdy
    public void drive() {
        System.out.println("This vehicle is driving.");
    }
}