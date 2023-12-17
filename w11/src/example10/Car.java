package example10;

public class Car implements Comparable<Car>{
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine!= null ? new Engine(engine.getType()) : new Engine("");
    }

    public Engine getEngine() {
        return new Engine(engine.getType());
    }

    @Override
    public String toString() {
        return "Car: " + engine;
    }

    @Override
    public int compareTo(Car o) {
        return engine.compareTo(o.getEngine());
    }
}
