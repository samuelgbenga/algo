package week_5.class_excercise6a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = {1,3,2,4,1,5,6,4,3,1,3};
        arrayList.add(50);
        arrayList.add(30);
        arrayList.add(70);
        arrayList.add(40);
        arrayList.add(10);


        Collections.sort(arrayList);

        Arrays.sort(arr);


       // System.out.println(arrayList.size());
//        for(int i: arrayList) System.out.println(i);
//
//        for (int i = 0; i < arr.length-1; i++) {
//            int minIndex = i;
//            for (int j = i; j < arr.length ; j++) {
//                if(arr[j]< arr[minIndex]){
//                    minIndex = j;
//                }
//            }
//            int temp = arr[minIndex];
//            arr[minIndex]  = arr[i];
//            arr[i] = temp;
//        }


        for(int i: arr) System.out.println(i);
      }

    }


