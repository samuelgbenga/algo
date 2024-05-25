package week_5.class_activity6a;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<Integer, String> fruit = new HashMap<>();

        fruit.put(1,"Orange");
        fruit.put(2,"Mango");
        fruit.put(3,"Papaya");
        fruit.put(4,"Lime");
        fruit.put(5,"Pear");

        for(Map.Entry<Integer, String> f: fruit.entrySet()){
            System.out.println("This is the fruit: "+ f.getValue()+" This is the key "+ f.getKey());
        }

    }
}
