package example24;

public class Test24 {

    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person("John", 20);
        people[1] = new Person("John", 30);
        people[2] = new Person("Adam", 20);
        people[3] = new Person("Adam", 16);
        System.out.println("Case 1");
        Pair<Person> pair = minmaxOld(people);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        Student[] students = new Student[4];
        students[0] = new Student("John", 20, 125478);
        students[1] = new Student("John", 30, 122278);
        students[2] = new Student("Adam", 20, 125433);
        students[3] = new Student("Adam", 16, 165478);
        //Pair<Student> pair2 = minmaxOld(students); // to nie jest możliwe
        System.out.println("Case 2");
        Pair<Student> pair2 = minmax(students);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        Person[] people2 = new Person[6];
        people2[0] = new Person("John", 20);
        people2[1] = new Person("John", 30);
        people2[2] = new Person("Adam", 20);
        people2[3] = new Student("John", 20, 125478);
        people2[4] = new Student("John", 30, 122278);
        people2[5] = new Student("Adam", 20, 125433);
        System.out.println("Case 3");
        Pair<Person> pair3 = minmaxOld(people2);
        System.out.println(pair3.getFirst());
        System.out.println(pair3.getSecond());
        System.out.println("Case 4");
        Pair<Person> pair4 = minmax(people2);
        System.out.println(pair4.getFirst());
        System.out.println(pair4.getSecond());
    }

    public static <T extends Comparable<T>> Pair<T> minmaxOld(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i=1; i<a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }

    public static <T extends Comparable<? super T>> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i=1; i<a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}
