package ex1;

import java.util.Arrays;

public class TestPerson {

    public static void main(String[] args) {
        Person[] osoby = new Person[4];
        osoby[0] = new Person("Krzysiek", 56);
        osoby[1] = new Person("Sylwia", 12);
        osoby[2] = new Person("Anna", 34);
        osoby[3] = new Person("Adam", 22);
        System.out.println(Arrays.toString(osoby));
        Arrays.sort(osoby);
        System.out.println(Arrays.toString(osoby));
    }
}
