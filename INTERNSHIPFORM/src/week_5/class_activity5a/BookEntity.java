package week_5.class_activity5a;

public class BookEntity {
    private final int id;
    private final String title;
    private final String author;
    private String bookQuantity;

    public BookEntity(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(String bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    @Override
    public String toString(){
        return (getTitle()+" written by "+getAuthor()+" with id: "+getId());
    }
}
