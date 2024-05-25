package week_5.class_activity2a;

public class Book {
    private final String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public String toString(){
        return bookName;
    }
}
