package example11;

public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = null;
        try {
            p2 = p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + p1.equals(p2));
    }
}
