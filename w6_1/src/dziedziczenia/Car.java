package dziedziczenia;

// Klasa pochodna
class Car extends Vehicle {
    private int numberOfDoors;

    // Konstruktor
    public Car(String brand, int numberOfDoors) {
        super(brand); // Wywołanie konstruktora klasy bazowej
        this.numberOfDoors = numberOfDoors;
    }

    // Metoda do wyświetlania liczby drzwi
    public void displayDoors() {
        System.out.println("Number of doors: " + numberOfDoors);
    }

    // Przesłonięcie metody drive
    @Override
    public void drive() {
        System.out.println("The car is driving smoothly.");
    }
}