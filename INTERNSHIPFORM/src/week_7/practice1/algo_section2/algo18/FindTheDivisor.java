package week_7.practice1.algo_section2.algo18;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;




//Create a function named divisors that takes a non-negative integer and returns
//        an array with all of the integer's divisors (except for 1 and the number itself).
//        If the number is prime return an empty array.
//
//        Challenge.divisors(n)
//        Parameters
//        n: Integer - number to be checked for divisors
//
//        Return Value
//        Integer[] - Array of numbers that can be divided into n
//
//        Constraints
//        0 <= n <= 1000
//
//        Examples
//        n	Return Value
//        12	[2,3,4,5,6]
//        13	[]
//        25	[5]
//


@DisplayName("divisors")
 class DivisorsTest {
    @Nested
    @DisplayName("sample tests")
    class SampleTests {

        @Test
        @DisplayName("basic cases")
        public void basicCases() {
            assertEquals(new ArrayList<>(Arrays.asList(3, 5)), FindTheDivisor.divisors(15));
            assertEquals(new ArrayList<>(Arrays.asList(2, 3, 4, 6)), FindTheDivisor.divisors(12));
            assertEquals(new ArrayList<Integer>(Arrays.asList()), FindTheDivisor.divisors(13));
        }
    }
}


public class FindTheDivisor {
    public static void main(String[] args) {

        System.out.println(divisors(25));
    }

    public static ArrayList<Integer> divisors(int n) {

        ArrayList<Integer> arrDivisor = new ArrayList<>();

        for (int i = 2; i <= n/2; i++) {
            if(n%i==0) arrDivisor.add(i);
        }


        return arrDivisor;
    }
}
