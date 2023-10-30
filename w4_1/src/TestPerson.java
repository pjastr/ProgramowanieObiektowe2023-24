public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.foo();
        System.out.println(p1.getName());

    }
}

class Person{
    private String name;
    private String age;

    public void setAge(String age) {
        this.age = age;
    }


    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void foo()
    {
        name = "Anna";
    }
}
