package week_5.class_excercise3a;

public class Book {

    private final int bookId;
    private final String title;
    private final String author;
    private int bookQuantity;

    public Book(int bookId, String title, String author, int bookQuantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.bookQuantity = bookQuantity;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    @Override
    public String toString(){
        return (title+" written by "+author);
    }
}
