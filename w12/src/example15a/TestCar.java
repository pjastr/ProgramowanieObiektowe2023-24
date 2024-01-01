package example15a;

public class TestCar {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("Ford", "Focus", new Engine("Diesel", 1.6));
        Car car2 = car1.clone();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
        System.out.println(car1.getEngine() == car2.getEngine());
    }
}
