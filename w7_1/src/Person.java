import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Sprawdzenie, czy obiekty są tym samym obiektem
        if (this == obj) return true;

        // Sprawdzenie, czy obj nie jest null i czy jest typu Person
        if (obj == null || getClass() != obj.getClass()) return false;

        // Rzutowanie obj do typu Person
        Person person = (Person) obj;

        // Porównanie pól
        if (age != person.age) return false;
        return Objects.equals(name, person.name);
    }

}

class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }
}

class Employee extends Person {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        // Sprawdzenie równości z perspektywy klasy bazowej
        if (!super.equals(obj)) return false;

        // Rzutowanie obj do typu Employee
        Employee employee = (Employee) obj;

        // Porównanie dodatkowego pola
        return department != null ? department.equals(employee.department) : employee.department == null;
    }

    // Gettery, settery, hashCode(), toString() itp.
}