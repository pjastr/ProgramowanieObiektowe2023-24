package example21;

public class TestPerson {

    public static void main(String[] args) {
        Double[] numbers = {1.0, 12.0, -3.0};
        System.out.println(ArrayAlg.min(numbers));
        Person[] people = {new Person("Jan", 12), new Person("Anna", 10), new Person("Piotr", 15)};
        System.out.println(ArrayAlg.min(people));
    }
}
