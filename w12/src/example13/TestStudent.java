package example13;

public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student("John", new double[]{10, 9, 8});
        try{
            Student student2 = student1.clone();
            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student1 == student2);
            System.out.println(student1.equals(student2));
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
