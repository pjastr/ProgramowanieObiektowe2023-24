public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Samochód jedzie.");
    }

    @Override
    public int foo(int a) {
        return 0;
    }
}