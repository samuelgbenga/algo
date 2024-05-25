package week_5.class_excercise9a;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Book book = new Book(1, "title", "author");
        Book book1 = new Book(2, "title1", "author1");
        Book book2 = new Book(3, "title2", "author2");
        Book book3 = new Book(4, "title3", "author3");
        Book book4 = new Book(5, "title4", "author4");


        LinkedList<Book> books = new LinkedList<>();

        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for(Book bk: books){
            System.out.println(bk);
        }


    }
}
