package week_5.class_excercise4a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit("Apple", "white");
        Fruit fruit1 = new Fruit("Apple1", "white1");
        Fruit fruit2 = new Fruit("Apple2", "white2");
        Fruit fruit3 = new Fruit("Apple3", "white3");
        Fruit fruit4 = new Fruit("Apple4", "white4");


        List<Fruit> fruits = new ArrayList<>();
        LinkedList<Fruit> linkedList = new LinkedList<>();

        fruits.add(fruit);
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        fruits.add(fruit4);

        //linked list
        linkedList.add(fruit);
        linkedList.add(fruit1);
        linkedList.add(fruit2);
        linkedList.add(fruit3);
        linkedList.add(fruit4);


        Iterator<Fruit> fruitIterator = fruits.iterator();

//        while(fruitIterator.hasNext()){
//            System.out.println(fruitIterator.next());
//        }
        for(Fruit fr: linkedList){
            System.out.println(fr);
        }


    }
}
