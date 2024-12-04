package my_algos.algo1.priority_scheduling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PriorityAndTimeStamp {


    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(
                "apple:1234571:9",
                "banana:1234572:1",
                "flamingo:1234573:2",
                "loophole:1234574:3",
                "adam:1234575:3",
                "eve:1234581:4",
                "math:1234577:4",
                "beauty:1234578:5",
                "rejoice:1234579:5",
                "adamant:1234580:6"
        ));
        ArrayList<String> resultArr = new ArrayList<>();


        Collections.sort(arr, (a,b)->{
            String[] strA = a.split(":");
            String[] strB = b.split(":");
            int priorityA = Integer.parseInt(strA[2]);
            int priorityB = Integer.parseInt(strB[2]);
            if(priorityA == priorityB){
                long timeStampA = Long.parseLong(strA[1]);
                long timeStampB = Long.parseLong(strB[1]);
                return Long.compare(timeStampA, timeStampB);
            }
            else return priorityA - priorityB;
        });


        System.out.println(arr.toString());
        for(String elem : arr){
            String[] tempArr = elem.split(":");
            resultArr.add(tempArr[0]);
        }

        System.out.println(resultArr);
    }


}
