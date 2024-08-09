package my_algos.algo2_strings.algo_section3.algo6;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(int num) {
        // Convert integer to string
        String numStr = String.valueOf(num);


        // Convert string to character array
        Character[] chars = new Character[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            chars[i] = numStr.charAt(i);
        }

        // Sort the array in descending order
        Arrays.sort(chars, Collections.reverseOrder());

        // Convert character array back to string
        StringBuilder sortedNumStr = new StringBuilder();
        for (char c : chars) {
            sortedNumStr.append(c);
        }

        // Convert string back to integer and return
        return Integer.parseInt(sortedNumStr.toString());
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sortDesc(42145));    // Output: 54421
        System.out.println(sortDesc(145263));   // Output: 654321
        System.out.println(sortDesc(123456789));// Output: 987654321
    }
}
