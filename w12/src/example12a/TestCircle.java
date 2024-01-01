package example12a;

public class TestCircle {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle c1 = new Circle(10, 20, 30);
        Circle c2 = c1.clone();
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        Shape c3 = c1.clone();
        System.out.println("c3: " + c3);
        System.out.println("c1 == c3: " + (c1 == c3));
        System.out.println("c1.equals(c3): " + c1.equals(c3));
        Shape c4 = new Circle(10, 20, 30);
        Circle c5 = (Circle) c4.clone(); // requires cast
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);
        System.out.println("c4 == c5: " + (c4 == c5));
    }
}
