package example4;

import java.util.Arrays;

public class TestEmployee {

    public static void main(String[] args) {
        System.out.println("Case1:");
        Employee e1 = new Employee("Jan Kowalski", 3000);
        Manager m1 = new Manager("Jan Kowalski", 3000, 1000);
        System.out.println(e1.compareTo(m1));
        System.out.println(m1.compareTo(e1));
        System.out.println("Case2:");
        Employee e2 = new Employee("Jan Kowalski", 3000);
        Employee e2_2 = new Employee("Jan Nowak", 3000);
        System.out.println(e2.compareTo(e2_2));
        System.out.println(e2_2.compareTo(e2));
        System.out.println("Case3:");
        Manager m3 = new Manager("Jan Nowak", 3000, 1000);
        Manager m3_2 = new Manager("Jan Kowalski", 3000, 2000);
        System.out.println(m3.compareTo(m3_2));
        System.out.println(m3_2.compareTo(m3));
        System.out.println("Case4:");
        Employee e4 = new Employee("Jan Kowalski", 3000);
        Manager m4 = new Manager("Jan Kowalski", 4000, 1000);
        System.out.println(e4.compareTo(m4));
        System.out.println(m4.compareTo(e4));
        System.out.println("Case5:");
        Manager m5 = new Manager("Jan Kowalski", 5000, 1000);
        Manager m5_2 = new Manager("Jan Kowalski", 3000, 1000);
        System.out.println(m5.compareTo(m5_2));
        System.out.println(m5_2.compareTo(m5));
        System.out.println("Case6:");
        Employee e6 = new Employee("Anna Nowak", 3000);
        Manager m6 = new Manager("Jan Kowalski", 3000, 1000);
        System.out.println(e6.compareTo(m6));
        System.out.println(m6.compareTo(e6));
        System.out.println("Case7:");
        Employee e7 = new Employee("Jan Kowalski", 3000);
        Manager m7 = new Manager("Anna Nowak", 3000, 1000);
        System.out.println(e7.compareTo(m7));
        System.out.println(m7.compareTo(e7));
        System.out.println("Case8:");
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Jan Kowalski", 3000);
        employees[1] = new Manager("Jan Kowalski", 3000, 1000);
        employees[2] = new Employee("Anna Nowak", 3000);
        employees[3] = new Manager("Anna Nowak", 4000, 1000);
        employees[4] = new Manager("Jan Kowalski", 5000, 3000);
        employees[5] = new Manager("Jan Kowalski", 8000, 1000);
        Arrays.sort(employees);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
