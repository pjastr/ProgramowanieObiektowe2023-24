public class TestSample {

    public static void main(String[] args) {
        System.out.println("Main method started");
        Sample sample = new Sample();
        System.out.println("Instance Variable: " + sample.instanceVar);
    }
}

class Sample {
    public int instanceVar = 5;

    {
        System.out.println("Instance block before - variable: " + instanceVar);
        instanceVar = 10;
        System.out.println("Instance block after - variable: " + instanceVar);
        System.out.println("Instance block executed");
    }

    public Sample() {
        System.out.println("Constructor before - variable: " + instanceVar);
        instanceVar = 15;
        System.out.println("Constructor after - variable: " + instanceVar);
        System.out.println("Constructor executed");
    }
}