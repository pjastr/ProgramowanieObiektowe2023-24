package example12;

public class TestCar {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car(new Engine("V8"));
        try {
            Car c2 = c1.clone();
            System.out.println("c1: " + c1);
            System.out.println("c2: " + c2);
            System.out.println("c1 == c2: " + (c1 == c2));
            System.out.println("c1.equals(c2): " + c1.equals(c2));
            System.out.println("c1.getEngine() == c2.getEngine(): " + (c1.getEngine() == c2.getEngine()));
            System.out.println("c1.getEngine().equals(c2.getEngine()): " + c1.getEngine().equals(c2.getEngine()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
