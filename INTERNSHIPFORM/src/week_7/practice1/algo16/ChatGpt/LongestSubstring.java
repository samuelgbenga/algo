package week_7.practice1.algo16.ChatGpt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class LongestSubstring {


    // imperative solution implementing hashset/
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    // lambda solution
    public static boolean containsDuplicate1(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        return IntStream.of(nums).anyMatch(num -> !seen.add(num));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] num4 = {0,1};
        List<String> strArr = List.of("samuel", "gbenga");
        String name = "samuel is a man";
        String[] strArr1 = name.split(" ");

        HashSet<Integer> setsmth = new HashSet<>();

        boolean isThere = IntStream.of(num4).anyMatch(num -> !setsmth.add(num));
       boolean isMatch = IntStream.of(num4).anyMatch((a)-> a > 2);

        System.out.println(isThere);

       //Alternative of strings is
       // Arrays.stream(strArr1).forEach(System.out::println);


//        System.out.println(containsDuplicate(nums1)); // Output: true
//        System.out.println(containsDuplicate(nums2)); // Output: false
//        System.out.println(containsDuplicate(nums3)); // Output: true
    }
}
