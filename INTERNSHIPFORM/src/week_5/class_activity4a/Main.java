package week_5.class_activity4a;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();

        hash.add("1");
        hash.add("2");
        hash.add("3");
        hash.add("4");
        hash.add("5");

        Iterator<String> iterate = hash.iterator();

        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

    }
}
