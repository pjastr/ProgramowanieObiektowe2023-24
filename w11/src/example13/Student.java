package example13;

import java.util.Arrays;

public class Student implements Cloneable{

    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades!= null ? grades.clone() : new double[0];
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + name + ", grades=" + Arrays.toString(grades);
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.grades = grades.clone();
        return student;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj== null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name) && Arrays.equals(grades, student.grades);
    }
}
