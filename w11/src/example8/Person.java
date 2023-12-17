package example8;

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + name + ", age=" + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
