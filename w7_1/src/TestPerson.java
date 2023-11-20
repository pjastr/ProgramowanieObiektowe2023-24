public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Jan", 15);
        Person p2 = new Person("Jan", 15);
        Student s1 = new Student("Jan", 15);
        Employee e1 = new Employee("Jan", 15, "IT");
        Employee e2 = new Employee("Jan", 15, "IT");
        System.out.println(e2 == e1);
        System.out.println(e2.equals(e1));
        double a = 1.2;
        double b = 1.1+0.1;
        System.out.println(a == b);
        System.out.println(Double.compare(a, b)==0);
    }
}
