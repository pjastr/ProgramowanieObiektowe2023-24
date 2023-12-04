package rekordy;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        System.out.println(person1);

        // Przykłady, które spowodują ostrzeżenia w konstruktorze
        Person person2 = new Person("", -5);
        System.out.println(person2);
    }
}