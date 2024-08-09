package my_algos.algo2_strings.algo_section2.algo13;

//Task
//        Complete the function in your editor.
//
//        Your function must merge strings a and b, and then return a single merged string.
//        A merge operation on two strings is described as follows:
//
//        Append alternating characters from a and b, respectively, to some new string, mergedString.
//        Once all of the characters in one of the strings have been merged,
//        append the remaining characters in the other string to mergedString.
//        Specification
//        Challenge.mergeStrings(a, b)
//        Parameters
//        a: String
//
//        b: String
//
//        Return Value
//        String - The mergedString
//
//        Constraints
//        1 ≤ |a length|, |b length| ≤ 25000
//
//        Examples
//        a	b	Return Value
//        "abc"	"def"	"adbecf" = ad be cf
//        "ab"	"def"	"adbef"    12 34 56
//        "abc"	"de"	"adbec"
//
//
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("mergeStrings")
 class MergeStringsTest {
    @Nested
    @DisplayName("with equal length strings")
    class WithEqualLengthStrings {

        @Test
        @DisplayName("should interlace the characters")
        public void shouldInterlaceTheCharacters() {
            assertEquals("adbecf", MergeStrings.mergeStrings("abc", "def"));
        }
    }

    @Nested
    @DisplayName("with non-equal length strings")
    class WithNonEqualLengthStrings {

        @Test
        @DisplayName("should interlace and append the extra characters")
        public void shouldInterlaceAndAppendTheExtraCharacters() {
            assertEquals("adbecfghij", MergeStrings.mergeStrings("abc", "defghij"));
        }
    }
}

public class MergeStrings {

    public static void main(String[] args) {

        String s = mergeStrings("abcdefgh", "123");

        System.out.println(s);

        // test your cases here
    }

    public static String mergeStrings(String a, String b) {



        // get the length of both str and b

        int lenA = a.length();
        int lenB = b.length();
        int len = lenA+lenB; // get the sum length of both str to us as loop constrain.
        // get the difference between length of a and b

        // make sure to invert it if there is possibility of negative sign;
        int lenDiff = (lenA < lenB ) ? lenB - lenA: lenA - lenB ; //len diff is needed know when to stop alternating

        // gets the remaining subString of the longest string after merge completion
        // returns the remaining string that would not be alternating in case of len difference
        //String newSub = (lenA < lenB) ? b.substring(lenA): a.substring(lenB);
                                        // a = abcd, b= efghijkl

        String newSub ="";
        if(lenA < lenB){
            newSub = b.substring(lenA);
        }else {
            newSub = a.substring(lenB);
        }


        // instantiate the final result and
        //
        String result = "";
        int even = 0; // counter for even alternating
        int odd = 0; // counter for odd alternating


        // does the alternating
        for (int i = 0; i< len; i++){ // loop through each string alternating between a and b
            if(i < len-lenDiff){ // a = ab b= cde thelendiff = 1 sum len = 5  alterna = ac bd :e
                if((1+i)%2 != 0){ // this if else checks for odd and even alternatively
                    //
                    result += a.charAt(odd); // appending the individual string  to the result.
                    odd++; //0,1,2,3
                }else {
                    result +=  b.charAt(even); // append str b (character) at even loop
                    even++;
                }
            }else {
                result += newSub;
                break;
            }
        }

        // do your magic here
        return result; // returns the final result
    }
}
