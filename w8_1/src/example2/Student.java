package example2;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name != null ? name : "";
        this.grades = grades != null ? Arrays.copyOf(grades, grades.length) : new double[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name : "";
    }

    public double[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }

    public void setGrades(double[] grades) {
        this.grades = grades != null ? Arrays.copyOf(grades, grades.length) : new double[0];
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Arrays.equals(grades, student.grades);

        // uwaga: zastąpienie Object.equals dla tablicy prymitywów nie jest poprawne
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(grades);
        return result;
    }
}
