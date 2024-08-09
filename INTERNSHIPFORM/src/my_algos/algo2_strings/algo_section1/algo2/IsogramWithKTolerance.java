package my_algos.algo2_strings.algo_section1.algo2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


//Test cases
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("isogramWithTolerance")
 class IsogramWithToleranceTest {
    @Nested
    @DisplayName("Test Cases")
    class TestCases {


        @Test
        @DisplayName("should identify a normal isogram with 0 tolerance")
        public void shouldIdentifyANormalIsogramWith0Tolerance() {

            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("subdermatoglyphic", 0));
        }

        @Test
        @DisplayName("should identify a k isogram with 2 tolerance")
        public void shouldIdentifyAKIsogramWith2Tolerance() {
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("ssubdermatoglyphicc", 2));
        }

        @Test
        @DisplayName("should identify a non k isogram with 2 tolerance")
        public void shouldIdentifyANonKIsogramWith2Tolerance() {
            assertEquals(false, IsogramWithKTolerance.isogramWithKTolerance("ssubdermatoglyphiccshhh", 2));
        }

        @Test
        @DisplayName("should ignore non alphabetical characters and case when true")
        public void shouldIgnoreNonAlphabeticalCharactersAndCaseWhenTrue() {
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("su bd e r m a t $$og$lyphics", 2));
        }

        @Test
        @DisplayName("should ignore non alphabetical characters and case when false")
        public void shouldIgnoreNonAlphabeticalCharactersAndCaseWhenFalse() {
            assertEquals(false, IsogramWithKTolerance.isogramWithKTolerance("ssu bd e r m a t $$og$lyphic sch", 2));
        }

        @Test
        @DisplayName("should handle the empty string")
        public void shouldHandleTheEmptyString() {
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("", 0));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("", 1));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("", 2));
        }

        @Test
        @DisplayName("should handle one character strings")
        public void shouldHandleOneCharacterStrings() {
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("a", 0));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("a", 1));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("a", 2));
        }

        @Test
        @DisplayName("should handle two character strings with the same character")
        public void shouldHandleTwoCharacterStringsWithTheSameCharacter() {
            assertEquals(false, IsogramWithKTolerance.isogramWithKTolerance("aa", 0));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("aa", 1));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("aa", 2));
        }

        @Test
        @DisplayName("should handle two character strings with different characters")
        public void shouldHandleTwoCharacterStringsWithDifferentCharacters() {
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("ab", 0));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("ab", 1));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("ab", 2));
        }

        @Test
        @DisplayName("should handle three character strings")
        public void shouldHandleThreeCharacterStrings() {
            assertEquals(false, IsogramWithKTolerance.isogramWithKTolerance("aaa", 0));
            assertEquals(false, IsogramWithKTolerance.isogramWithKTolerance("abb", 0));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("abb", 1));
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("abb", 2));
        }

        @Test
        @DisplayName("should handle larger tolerances")
        public void shouldHandleLargerTolerances() {
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("aa bb cc dd e", 4));
            assertEquals(false, IsogramWithKTolerance.isogramWithKTolerance("aa bb cc dd ee", 4));
        }

        @Test
        @DisplayName("should handle case")
        public void shouldHandleCase() {
            assertEquals(true, IsogramWithKTolerance.isogramWithKTolerance("Aa Bb Cc Dd e", 4));
            assertEquals(false, IsogramWithKTolerance.isogramWithKTolerance("Aa Bb Cc Dd Ee", 4));
        }
    }
}



public class IsogramWithKTolerance {


    public static boolean isogramWithKTolerance(String str, int k){


        str = str.toLowerCase().replaceAll("[^a-z]", "");
        char[] arr = str.toCharArray();

        // instantiate hashmap to take in the unique characters from the
        HashSet<Character> characters = new HashSet<>();
        for(char a: arr) characters.add(a);


        // instantiate a list to take in the length of the different characters.
        List<Integer> intArr = new ArrayList<>();
        characters.forEach((i)->{
            int count = 0;
            for(char a: arr){
                if(i==a) count++;
            }
            intArr.add(count);
        });

        //
        List<Integer> newIntArr = intArr.stream().filter(a-> a>1).toList();


        return k >= newIntArr.size();
    }

    public static void main(String[] args) {


        String str = "a b  c";
        String str1 = "Aa Bb Cc Dd e";
        String str2 = "aa bb cc dd e";
        String str3 = "su bd e r m a t $$og$lyphics";
        String str4 = "ssubdermatoglyphiccshhh";
        int k = 2;

        System.out.println(isogramWithKTolerance(str, k));
        System.out.println("+++++++++++++++++");

        System.out.println(isogramWithKTolerance(str1, k));
        System.out.println("+++++++++++++++++");

        System.out.println(isogramWithKTolerance(str2, k));
        System.out.println("+++++++++++++++++");

        System.out.println(isogramWithKTolerance(str3, k));
        System.out.println("+++++++++++++++++");

        System.out.println(isogramWithKTolerance(str4, k));
        System.out.println("+++++++++++++++++");


    }
}
