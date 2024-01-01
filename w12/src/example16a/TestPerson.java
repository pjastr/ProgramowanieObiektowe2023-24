package example16a;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("Jan", 30);
        System.out.println(person);
        // ważne: w przypadku błędu, program zostanie przerwany
        // kod powinien mieć kod wyjścia zero na egzaminie (!!!)
        try {
            Person person2 = new Person(null, 30);
            System.out.println(person2);
        } catch (IllegalArgumentException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}
