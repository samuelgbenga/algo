package week_5.class_activities11a;


public class Main {
    public static void main(String[] args) {

        GenericPrinter printPerson = new GenericPrinter();
        GenericPrinter printBook = new GenericPrinter();
        GenericPrinter printNumber = new GenericPrinter();


        printPerson.setGenericType(new Person("firstName", "LastName"));
        printBook.setGenericType(new Book("title of Book", "author of Book", 123));

        printNumber.setGenericType(1234);

        System.out.println(printPerson);
        System.out.println("**************************");
        System.out.println(printBook);
        System.out.println("**************************");
        System.out.println(printNumber);


    }
}

class Person{
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class Book{
    private final String title;
    private final String author;
    private final int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}

//  T generics parameter stands to represent type Person
class GenericPrinter<T>{

    private T obj;

    public void setGenericType(T obj){
        this.obj = obj;
    }

    @Override
    public String toString(){
        return ""+obj;
    }
}
