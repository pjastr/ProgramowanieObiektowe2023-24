package example2;

public class TestStudent {

    public static void main(String[] args) {
        double[] grades = new double[]{5.5, 4.0, 3.5};
        Student student = new Student("Jan Kowalski", grades);
        System.out.println(student);
        student.setName("Anna Nowak");
        double[] grades1 = student.getGrades();
        grades1[0] = 2.0;
        System.out.println(student);
        double[] grades2 = new double[]{5.5, 4.0, 3.5};
        Student student2 = new Student("Anna Nowak", grades2);
        System.out.println(student.equals(student2));
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
    }
}
