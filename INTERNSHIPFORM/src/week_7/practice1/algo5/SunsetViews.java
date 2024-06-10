package week_7.practice1.algo5;

//Given an array of buildings and a direction that all of the buildings face,
//        return an array of the indices of the buildings that can see the sunset.
//
//        A building can see the sunset if it's strictly taller than all of the
//        buildings that come after it in the direction that it faces.
//
//        The input array named buildings contains positive, non-zero integers
//        representing the heights of the buildings. A building at index i thus
//        has a height denoted by buildings[i]. All of the buildings face the same direction,
//        and this direction is either east or west, denoted by the input string named direction,
//        which will always be equal to either "EAST" or "WEST". In relation to the input array,
//        you can interpret these directions as right for east and left for west.
//
//        Important note: the indices in the ouput array should be sorted in ascending order.
//
//
//
//        Sunset Views
//
//        Sample Input #1
//        buildings = [3, 5, 4, 4, 3, 1, 3, 2]
//        direction = "EAST" // -> Right
//
//        Sample Output #1
//        [1, 3, 6, 7] // The indexes of the buildings that can see the Sun
//        As shown in the image above, with the building's height and their indexes,
//        only the buildings that have a clear view in the East direction are returned.
//        When the direction is WEST, the returned values are different.
//
//        Sample Input #2
//        buildings = [3, 5, 4, 4, 3, 1, 3, 2]
//        direction = "WEST" // <- Left
//
//        Sample Output #2
//        [0, 1]
//
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.jupiter.api.BeforeEach;
//import java.util.*;
//
//public class ProgramTest {
//    @Test
//    public void TestCase1() {
//        int[] buildings = new int[] {3, 5, 4, 4, 3, 1, 3, 2};
//        String direction = "EAST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 7));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase2() {
//        int[] buildings = new int[] {3, 5, 4, 4, 3, 1, 3, 2};
//        String direction = "WEST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase3() {
//        int[] buildings = new int[] {10, 11};
//        String direction = "EAST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase4() {
//        int[] buildings = new int[] {2, 4};
//        String direction = "WEST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase5() {
//        int[] buildings = new int[] {1};
//        String direction = "EAST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase6() {
//        int[] buildings = new int[] {1};
//        String direction = "WEST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase7() {
//        int[] buildings = new int[] {};
//        String direction = "EAST";
//        ArrayList<Integer> expected = new ArrayList<Integer>();
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase8() {
//        int[] buildings = new int[] {};
//        String direction = "WEST";
//        ArrayList<Integer> expected = new ArrayList<Integer>();
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase9() {
//        int[] buildings = new int[] {7, 1, 7, 8, 9, 8, 7, 6, 5, 4, 2, 5};
//        String direction = "EAST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 11));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase10() {
//        int[] buildings = new int[] {1, 2, 3, 4, 5, 6};
//        String direction = "EAST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(5));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//
//    @Test
//    public void TestCase11() {
//        int[] buildings = new int[] {1, 2, 3, 4, 5, 6};
//        String direction = "WEST";
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
//
//        var actual = new Program().sunsetViews(buildings, direction);
//        assertTrue(expected.equals(actual));
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "WEST"; // or "WEST"

        // Getting the output
        ArrayList<Integer> result = sunsetViews(buildings, direction);
        System.out.println(result);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.

        return null;
    }

}