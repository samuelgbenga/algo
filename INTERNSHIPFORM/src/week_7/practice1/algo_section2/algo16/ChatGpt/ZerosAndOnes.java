package week_7.practice1.algo_section2.algo16.ChatGpt;


import java.util.HashMap;

 class CountBinarySubstrings {

    public static int cbs(String s) {
        // Map to store the counts of consecutive 0's and 1's
        HashMap<Integer, Integer> groupLengths = new HashMap<>();

        int groupIndex = 0; // To keep track of current group index
        groupLengths.put(groupIndex, 1); // Initialize the first group
                                                                            //0000011111
        // Traverse the string to count lengths of consecutive 0's and 1's
        for (int i = 1; i < s.length(); i++) { // 0,1/
            if (s.charAt(i) == s.charAt(i - 1)) {   //0,2  0,3 0,4 0,5
                groupLengths.put(groupIndex, groupLengths.get(groupIndex) + 1); //1,1  1,2 1,3 1,4  1,5
            } else {
                groupIndex++;
                groupLengths.put(groupIndex, 1);
            }
        }

        // Calculate the total number of valid substrings
        int totalValidSubstrings = 0;
        for (int i = 1; i <= groupIndex; i++) {
            totalValidSubstrings += Math.min(groupLengths.get(i - 1), groupLengths.get(i)); //1+1=2
        }

        return totalValidSubstrings;
    }


}

public class ZerosAndOnes {
    public static void main(String[] args) {
        String s = "0000011111";
        String s1 = "10101";
        String s2 = "0011";

        System.out.println(CountBinarySubstrings.cbs(s)); // Output: 6

       // System.out.println(Math.min(2,2));

//        HashMap<Integer, Integer> ken = new HashMap<>();
//
//        int sam = ken.getOrDefault(1,0);
//
//        System.out.println(sam);
    }
}


