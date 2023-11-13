import java.util.ArrayList;
import java.util.Arrays;

public class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = b1.createBook("ABc", 12.2);
        System.out.println(b1);
        System.out.println(b2);
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(4);
        lt.add(-34);
        System.out.println(lt);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        System.out.println(books);
        int[] tab = { 3,-5};
        System.out.println(tab);
        System.out.println(Arrays.toString(tab));
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

    public Book createBook(String title, double price)
    {
        Book temp = new Book();
        temp.title = title;
        temp.price = price;
        return temp;
    }
}
