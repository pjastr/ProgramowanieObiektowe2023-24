public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Rower jedzie.");
    }

    @Override
    public int foo(int a) {
        return 0;
    }


    @Override
    public void turnOnLights() {
        System.out.println("Rower");
    }


    static void horn() {
        System.out.println("Trąbienie! - rower");
    }

    public void stop(){
        System.out.println("stop");
    }
}