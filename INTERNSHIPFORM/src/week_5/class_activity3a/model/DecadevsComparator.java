package week_5.class_activity3a.model;

import java.util.Comparator;

public class DecadevsComparator implements Comparator<DecaDevs>{
    @Override
    public int compare(DecaDevs p1, DecaDevs p2) {

//        if(p1.isFemale() && !p2.isFemale()){
//            return -1;
//        }
//        else if(!p1.isFemale() && p2.isFemale()){
//            return 1;
//        }
//        else
            if(p1.isMale() && !p2.isMale()){
            return -1;
        }
        else if(!p1.isMale() && p2.isMale()){
            return 1;
        }
        else{
            return 0;
        }

    }
}
