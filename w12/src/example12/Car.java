package example12;

public class Car implements Cloneable{

    private Engine engine;

    public Car(Engine engine) throws CloneNotSupportedException {
        this.engine = engine!= null ? engine.clone() : new Engine("");
    }

    public Engine getEngine() throws CloneNotSupportedException {
        return engine.clone();
    }

    @Override
    public String toString() {
        return "Car: " + engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.engine = this.engine.clone(); // deep copy
        return car;
    }
}
