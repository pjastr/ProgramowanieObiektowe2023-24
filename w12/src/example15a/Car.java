package example15a;

public class Car implements Cloneable{

    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public String toString() {
        return brand + " " + model + " " + engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }


}
