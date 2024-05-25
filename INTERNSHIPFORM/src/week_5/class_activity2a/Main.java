package week_5.class_activity2a;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

//        PriorityQueue<Person> people = new PriorityQueue<>(new AgeComparator());

        //PriorityQueue<String> str = new PriorityQueue<>();
//
//        PriorityQueue<Book> book = new PriorityQueue<>();
//
//        Book book1 = new Book("name1");
//        Book book2 = new Book("name2");
//        Book book3 = new Book("name3");

//        book.add(book1);
////        book.add(book2);
////        book.add(book3);




//        str.add("2");
//        str.add("3");
//        str.add("4");



        Person p1 = new Person("china", 34);
        Person p6 = new Person("China", 34);
        Person p2 = new Person("USA", 45);
        Person p3 = new Person("India", 29);
        Person p4 = new Person("Brazil", 37);
        Person p5 = new Person("Australia", 50);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        Collections.sort(people, new AgeComparator());



        Iterator<Person> iterator = people.iterator();


//        while(!people.isEmpty()){
//            Person person = people.poll();
//            System.out.println(person.getName()+" The age is:"+person.getAge());
//        }

        while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.getName() +" and " + person.getAge());
        }

//        for(Person person: people){
//            System.out.println(person.getName()+" "+ person.getAge());
//        }


    }
}
