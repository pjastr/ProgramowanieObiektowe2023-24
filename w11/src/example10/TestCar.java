package example10;

import java.util.Arrays;

public class TestCar {

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(new Engine("V8"));
        cars[1] = new Car(new Engine("V6"));
        cars[2] = new Car(new Engine("V12"));
        cars[3] = new Car(new Engine("V4"));
        cars[4] = new Car(new Engine("V10"));
        Arrays.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
