public class TestBook {

    public static void main(String[] args) {
        Author author = new Author("George Orwell", 46);
        Book book = new Book(author, 19.99);

        System.out.println(book);
        Author author1 = book.getAuthor();
        author1.setName("Adam Mickiewicz");
        System.out.println(book);

        Book sameBook = new Book(new Author("George Orwell", 46), 19.99);
        System.out.println("Are books equal? " + book.equals(sameBook));
        System.out.println("Hashcode of book: " + book.hashCode());
        System.out.println("Hashcode of sameBook: " + sameBook.hashCode());
    }
}