package finalnaklasa;

import java.util.ArrayList;

public class TestMyImmutableClass {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ABC");
        lista.add(new String("XYZ"));
        lista.add("");
        MyImmutableClass obj1 = new MyImmutableClass(45, "Name", lista);
        ArrayList<String> lista2 = obj1.getItems();
        System.out.println(obj1);
        lista2.add("qqq");
        System.out.println(obj1);
    }
}
