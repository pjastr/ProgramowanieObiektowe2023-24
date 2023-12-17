package example1;

import java.util.Arrays;

public class TestPerson {

    public static void main(String[] args) {
        Person[] people = {
            new Person("John", 20),
            new Person("Sally", 30),
            new Person("Sally", 20),
            new Person("John", 30)
        };
        System.out.println(Arrays.toString(people));
        for (Person person : people) {
            System.out.println(person);
        }
        Arrays.sort(people);
        System.out.println("After sorting:");
        for (Person person : people) {
            System.out.println(person);
        }
        Person[] people2 = new Person[3];
        people2[0] = new Person("John", 20);
        people2[1] = new Person("Sally", 30);
        people2[2] = new Person("Sally", 20);
        Arrays.sort(people2);
        System.out.println("After sorting:");
        for (Person person : people2) {
            System.out.println(person);
        }
    }
}
