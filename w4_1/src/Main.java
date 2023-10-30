public class Main {
    public static void main(String[] args) {
        Telephone t1 = new Telephone();
        System.out.println(t1);
        t1.setBrand("Nokia");
        t1.call("345");

    }
}

class Telephone {

    private String brand;
    private String model;

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void call(String number) {
        System.out.println("Calling number " + number + " from " + brand + " " + model);
    }

    public void sendMessage(String number, String content) {
        System.out.println("Sending a message to " + number + " with content: " + content);
    }

}