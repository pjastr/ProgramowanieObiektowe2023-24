package example24;

public class Student extends Person implements Comparable<Person>{

    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        if (studentId <10000 || studentId > 999999) {
            throw new IllegalArgumentException("Wrong student ID");
        }
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId <10000 || studentId > 999999) {
            throw new IllegalArgumentException("Wrong student ID");
        }
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", studentId=" + studentId;
    }

    @Override
    public int compareTo(Person o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            int base = super.compareTo(student);
            if (base != 0) {
                return base;
            }
            return Integer.compare(this.studentId, student.studentId);
        }
        return super.compareTo(o);
    }
}
