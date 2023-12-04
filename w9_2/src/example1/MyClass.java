package example1;

public class MyClass implements MyInterface {
    private int age;

    public MyClass(int age) {
        this.age = age;
    }

    @Override
    public void showAge() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        MyClass person = new MyClass(30);
        person.showAge();
        person.showMaxAge();
        System.out.println("Maximum age is: " + MyInterface.MAX_AGE);
    }
}
