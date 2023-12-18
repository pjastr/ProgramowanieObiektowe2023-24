package example3;

import java.util.Arrays;

public class TestEmployee {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Jan Kowalski", 3000);
        employees[1] = new Manager("Adam Nowak", 5000, 1000);
        employees[2] = new Employee("Anna Zawadzka", 4000);

        System.out.println("Case1:");
        for (var employee : employees) {
            System.out.println(employee);
        }

        //Arrays.sort(employees);
        //System.out.println("After sorting:");
        //for (var employee : employees) {
        //    System.out.println(employee);
        //}

        Employee[] employees2 = new Employee[3];
        employees2[0] = new Manager("Adam Nowak", 5000, 1000);
        employees2[1] = new Manager("Adam Nowak", 4500, 2000);
        employees2[2] = new Manager("Anna Zawadzka", 4000, 3000);
        System.out.println("Case2:");
        for (var employee : employees2) {
            System.out.println(employee);
        }

        Arrays.sort(employees2);

        System.out.println("After sorting:");
        for (var employee : employees2) {
            System.out.println(employee);
        }

    }
}
