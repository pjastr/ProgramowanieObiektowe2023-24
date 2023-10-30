import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestBook {

    public static void main(String[] args) {
        int[] tablica = new int[3];
        Book[] ksiazki = new Book[2];
        ksiazki[0] =  new Book();
        System.out.println(ksiazki[0].getPrice());
        ArrayList<Book> ks2 = new ArrayList<>();
        ks2.add(new Book());

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