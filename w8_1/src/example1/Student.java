package example1;


import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(String name, ArrayList<Double> grades) {
        this.name = name != null ? name : "";
        this.grades = grades != null ? new ArrayList<>(grades) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name : "";
    }

    public ArrayList<Double> getGrades() {
        return new ArrayList<>(grades);
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades != null ? new ArrayList<>(grades) : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && grades.equals(student.grades);
        //return Objects.equals(name, student.name) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades);
    }
}