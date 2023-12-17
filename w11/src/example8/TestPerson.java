package example8;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPerson {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("John", 20);
        people[1] = new Person("Mary", 25);
        people[2] = new Person("Paul", 18);
        people[3] = new Person("Peter", 23);
        people[4] = new Person("Mary", 19);
        System.out.println("Case1");
        Arrays.sort(people, new AgeComparator());
        for (var elem: people) {
            System.out.println(elem);
        }
        System.out.println("Case2");
        Arrays.sort(people, new NameComparator());
        for (var elem: people) {
            System.out.println(elem);
        }
        System.out.println("Case3");
        Arrays.sort(people, new TwoCondComparator());
        for (var elem: people) {
            System.out.println(elem);
        }
        System.out.println("Case4");
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("John", 20));
        peopleList.add(new Person("Mary", 25));
        peopleList.add(new Person("Paul", 18));
        peopleList.add(new Person("Peter", 23));
        peopleList.add(new Person("Mary", 19));
        peopleList.sort(new TwoCondComparator());
        for (var elem: peopleList) {
            System.out.println(elem);
        }
    }
}
