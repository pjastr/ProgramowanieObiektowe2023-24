package example1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>(Arrays.asList(5.5, 4.0, 3.5));
        Student student = new Student("Jan Kowalski", grades);
        System.out.println(student);
        student.setName("Anna Nowak");
        student.getGrades().add(2.0);
        System.out.println(student);
        ArrayList<Double> grades2 = new ArrayList<>(Arrays.asList(5.5, 4.0, 3.5));
        Student student2 = new Student("Anna Nowak", grades2);
        System.out.println(student.equals(student2));
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
    }
}