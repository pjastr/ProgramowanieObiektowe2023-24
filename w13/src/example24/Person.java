package example24;

public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + name + ", age=" + age;
    }

    @Override
    public int compareTo(Person o) {
        int base = this.name.compareTo(o.name);
        if (base != 0) {
            return base;
        }
        return Integer.compare(this.age, o.age);
    }
}
