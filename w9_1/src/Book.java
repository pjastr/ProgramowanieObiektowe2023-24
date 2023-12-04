import java.util.Objects;

public class Book {
    private Author author;
    private double price;


    public Book(Author author, double price) {
        this.author = author != null ? new Author(author.getName(), author.getAge()) : new Author("", 0);
        this.price = price;
    }

    public Author getAuthor() {
        return new Author(author.getName(), author.getAge());
    }

    public void setAuthor(Author author) {
        this.author = author != null ? new Author(author.getName(), author.getAge()) : new Author("", 0);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, price);
    }
}