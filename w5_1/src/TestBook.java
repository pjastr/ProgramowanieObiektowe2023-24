import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setPrice(23.40);
        System.out.println(b1.getPrice());
        double temp = b1.getPrice();
        temp += 20;
        System.out.println(b1.getPrice());
        b1.setTitle("Pan Tadeusz");
        System.out.println(b1.getTitle());
        String temps = b1.getTitle();
        temps = temps + "aa";
        System.out.println(b1.getTitle());
    }
}


class Book {
    private String title;
    private double price;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            this.title = "";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }
}