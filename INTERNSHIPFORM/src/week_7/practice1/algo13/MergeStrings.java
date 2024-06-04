package week_7.practice1.algo13;

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
//        "abc"	"def"	"adbecf"
//        "ab"	"def"	"adbef"
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

        String s = mergeStrings("abc", "defghlkj");

        System.out.println(s);

        // test your cases here
    }

    public static String mergeStrings(String a, String b) {


        int lenA = a.length();
        int lenB = b.length();
        int len = lenA+lenB;
        // get the difference between length of a and b
        // make sure to invert it if there is possibility of negative sign;
        int lenDiff = (lenA- lenB < 0) ? lenB - lenA: lenA - lenB ;

        // gets the remaining subString of the longest string after merge completion
        String newSub = (lenA < lenB) ? b.substring(lenA): a.substring(lenB);

        String result = "";
        int even = 0;
        int odd = 0;

        for (int i = 0; i< len; i++){
            if(i < len-lenDiff){
                if((1+i)%2 != 0){
                    result += a.charAt(odd);
                    odd++;
                }else {
                    result +=  b.charAt(even);
                    even++;
                }
            }else {
                result += newSub;
                break;
            }
        }

        // do your magic here
        return result;
    }
}
