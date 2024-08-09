package my_algos.algo2_strings.algo_section1.algo3;

//Task
//        Write a function capitalize_words(s) which capitalizes every word in the non-null (but possibly empty)
//        string s. A word is defined as a series of characters bordered by space characters
//        and/or the start or end of the string on either side. For the purposes of this challenge,
//        punctuation is considered part of a word as a non-space character.
//
//        Any ASCII characters in the inclusive range 0-127 may exist in s.
//
//        Examples
//        capitalize_words("") -> ""
//        capitalize_words("a") -> "A"
//        capitalize_words("aa") -> "Aa"
//        capitalize_words("aaa") -> "Aaa"
//        capitalize_words("a a") -> "A A"
//        capitalize_words("aa a aaa") -> "Aa A Aaa"
//        capitalize_words(" 12D 8a A xy") -> " 12D 8a A Xy"
//        capitalize_words("ab.c") -> "Ab.c"
//        capitalize_words("ab. cC") -> "Ab. CC"
//        capitalize_words("ab\ncd") -> "Ab\nCd"
//        capitalize_words("ab\tcd") -> "Ab\tCd"


//Test cases
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("capitalizeWords")
class CapitalizeWordsTest {
    @Nested
    @DisplayName("example tests")
    class ExampleTests {

        @Test
        @DisplayName("empty string")
        public void emptyString() {
            assertEquals("", CapitalizeWords.capitalizeWords(""));
        }

        @Test
        @DisplayName("single char")
        public void singleChar() {
            assertEquals("A", CapitalizeWords.capitalizeWords("a"));
        }

        @Test
        @DisplayName("two chars")
        public void twoChars() {
            assertEquals("Aa", CapitalizeWords.capitalizeWords("aa"));
        }

        @Test
        @DisplayName("three chars")
        public void threeChars() {
            assertEquals("Aaa", CapitalizeWords.capitalizeWords("aaa"));
        }

        @Test
        @DisplayName("two single letter words")
        public void twoSingleLetterWords() {
            assertEquals("A A", CapitalizeWords.capitalizeWords("a a"));
        }

        @Test
        @DisplayName("three words")
        public void threeWords() {
            assertEquals("Aa A Aaa", CapitalizeWords.capitalizeWords("aa a aaa"));
        }

        @Test
        @DisplayName("digits")
        public void digits() {
            assertEquals(" 12D 8a A Xy ", CapitalizeWords.capitalizeWords(" 12D 8a A xy "));
        }

        @Test
        @DisplayName("punctuation inside word")
        public void punctuationInsideWord() {
            assertEquals("Ab.c", CapitalizeWords.capitalizeWords("ab.c"));
        }

        @Test
        @DisplayName("punctuation at end of sentence")
        public void punctuationAtEndOfSentence() {
            assertEquals("Ab. CC", CapitalizeWords.capitalizeWords("ab. cC"));
        }

        @Test
        @DisplayName("newline")
        public void newline() {
            assertEquals("Ab\nCd", CapitalizeWords.capitalizeWords("ab\ncd"));
        }

        @Test
        @DisplayName("tab")
        public void tab() {
            assertEquals("Ab\tCd", CapitalizeWords.capitalizeWords("ab\tcd"));
        }

        @Test
        @DisplayName("multiple whitespaces")
        public void multipleWhitespaces() {
            assertEquals("\t B \nABB   C  Cd", CapitalizeWords.capitalizeWords("\t b \naBB   C  cd"));
        }
    }
}




public class CapitalizeWords {
    public static void main(String[] args) {

        // Test your cases here

        String str = " 12D 8a A xy ";

//        String[] strArr = str.split("\\s+");
//        String notAlphabet = str.toLowerCase().replaceAll("[a-z]", "");
//
//
//
//        System.out.println(Arrays.toString(strArr));
//        System.out.println(notAlphabet);




        String result = capitalizeWords(str);

        System.out.println(result);

    }

//    public static String capitalizeWords(String str) {
//
//        // Do your magic here
//       if(str.length()==0) return "";
//
//
//
//
//        String[] strArr = str.trim().split("\\s+");
//
//        //for(String s: strArr) System.out.println(s+",");
//        String notAlphabet;
//        String cap;
//        String subStr;
//
//        String result = "";
//
//        for(String word: strArr){
//            notAlphabet = word.toLowerCase().replaceAll("[a-z]", "");
//            word = word.toLowerCase().replaceAll("[^a-z]","");
//            cap = word.substring(0,1).toUpperCase();
//            subStr = word.substring(1,word.length());
//            result += notAlphabet+cap+subStr+" ";
//        }
//
//
//        return result.trim();
//    }



    public static String capitalizeWords(String s) {
        if (s.isEmpty()) return ""; // If the string is empty, return empty string

        // Split the string into words using space as delimiter
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Capitalize the first character of each word
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    // Append the remaining characters as they are
                    result.append(word.substring(1));
                }
            }
            // Append space after each word
            result.append(" ");
        }

        // Remove the trailing space and return the result
        return result.toString().replaceAll("\\s+$", "");
    }



//public static String capitalizeWords(String s) {
//    if (s.isEmpty()) return ""; // If the string is empty, return empty string
//
//    StringBuilder result = new StringBuilder();
//
//    // Split the string into words using space as delimiter
//    String[] words = s.split("\\s+");
//
//    for (String word : words) {
//        // Capitalize the first character of each word
//        if (!word.isEmpty()) {
//            result.append(Character.toUpperCase(word.charAt(0)));
//            if (word.length() > 1) {
//                // Append the remaining characters as they are
//                result.append(word.substring(1));
//            }
//        }
//        // Append space after each word
//        result.append(" ");
//    }
//
//    // Remove the trailing space and return the result
//    return result.toString().trim();
//}
}