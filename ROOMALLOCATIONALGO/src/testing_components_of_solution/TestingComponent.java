package testing_components_of_solution;

import java.util.Arrays;
import java.util.Comparator;

public class TestingComponent {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,8,5};
        int[][] multiArr = {{1,4},{4,5},{7,8},{2,6}};
        boolean isCool = true;


        Arrays.sort(arr);
        Arrays.sort(multiArr, Comparator.comparing(a-> a[0]));

        System.out.println(!isCool);
        System.out.println((Arrays.deepToString(multiArr)));
    }
}
