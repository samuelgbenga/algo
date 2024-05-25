package week_5.class_activity5a;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookEntity book = new BookEntity(23, "book0", "author0");
        BookEntity book1 = new BookEntity(1, "book1", "author1");
        BookEntity book2 = new BookEntity(2, "book2", "author2");
        BookEntity book3 = new BookEntity(3, "book3", "author3");
        BookEntity book4 = new BookEntity(24, "book4", "author4");


        HashSet<BookEntity> hash = new HashSet();

        hash.add(book);
        hash.add(book1);
        hash.add(book2);
        hash.add(book3);
        hash.add(book4);
        hash.add(book); // set ignores repeatation;

        for (BookEntity books: hash){
            System.out.println(books);
        }

    }
}
