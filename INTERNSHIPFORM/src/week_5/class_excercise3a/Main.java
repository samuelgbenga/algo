package week_5.class_excercise3a;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(1, "title", "author", 1);
        Book book2 = new Book(2, "title2", "author2", 2);
        Book book3 = new Book(3, "title3", "author3", 3);
        Book book4 = new Book(4, "title4", "author4", 4);
        Book book5 = new Book(5, "title5", "author5", 5);


        HashMap<Integer, Book> bookHashMap = new HashMap<>();

        bookHashMap.put(1, book1);
        bookHashMap.put(2, book2);
        bookHashMap.put(3, book3);
        bookHashMap.put(4, book4);
        bookHashMap.put(5, book5);

        for(Map.Entry<Integer, Book> singleEntry: bookHashMap.entrySet()){
            System.out.println("The key of the book is: "+singleEntry.getKey()+" The book title is: "+ singleEntry.getValue());
        }


    }
}
