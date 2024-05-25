package week_5.class_activity1b;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("one");
        priorityQueue.add("two");
        priorityQueue.add("three");
        priorityQueue.add("four");
        priorityQueue.add("five");
        priorityQueue.add("six");
        priorityQueue.add("seven");


        Iterator<String> iterator = priorityQueue.iterator();

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        System.out.println("*************");
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
}}
