public class Main {

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.drive();
        b1.turnOnLights();
        Car c1 = new Car();
        c1.turnOnLights();
        Vehicle.horn();
        Bike.horn();
        Vehicle v1 = new Bike();
        v1.drive();
        //v1.stop();

    }
}
