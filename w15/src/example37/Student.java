package example37;


public class Student implements Comparable<Student>{

    private String name;

    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Student other =  (Student) otherObject;
        return Double.compare(this.grade, other.grade) == 0 && this.name.equals(other.name);
    }

    @Override
    public int hashCode(){
        int temp = this.name.hashCode();
        temp = 31* temp + Double.valueOf(this.grade).hashCode();
        return temp;
    }

    @Override
    public int compareTo(Student o) {
        int base = this.name.compareTo(o.name);
        if (base !=0)
            return base;
        return Double.compare(this.grade, o.grade);
    }
}
