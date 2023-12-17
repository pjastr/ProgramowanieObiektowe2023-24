package example3;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + name + ",salary=" + salary + ".";
    }

    @Override
    public int compareTo(Employee other) {
        // Porównanie na podstawie nazwiska
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        // Porównanie na podstawie wynagrodzenia
        return Integer.compare(this.salary, other.salary);
    }
}

