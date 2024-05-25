package week_5.class_excercise9a;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private  int quantityOfBooks;

    public Book(int id, String title, String author) {
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

    public int getQuantityOfBooks() {
        return quantityOfBooks;
    }

    public void setQuantityOfBooks(int quantityOfBooks) {
        this.quantityOfBooks = quantityOfBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", quantityOfBooks=" + quantityOfBooks +
                '}';
    }
}
