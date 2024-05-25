package week_5.class_activity1a;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {


    public static void main(String[] args) {


        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("Enugu");
        cityName.add("Awka");
        cityName.add("Benin");
        cityName.add("Kaduna");
        cityName.add("benue");

        Iterator<String> iterator = cityName.iterator();

        while(iterator.hasNext()){

            String city = iterator.next();
            System.out.println(city);
        }


    }
}
