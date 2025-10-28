public class Book {
    private final String author;
    private final String title;

    private Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return " " + title + "  " + author;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book);
        }
    }