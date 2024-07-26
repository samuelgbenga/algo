package algo.chatGPT_solution.chatGPT6;

public class LongestPalindromeString {

    public String longestPalindrome(String s) {

        //1 return null if empty
        if (s == null || s.length() < 1) return "";

        // 2&3 and two instantiate 2 and 3
        int start = 0, end = 0;

        //4 loop through the link using for loop
        for (int i = 0; i < s.length(); i++) {

            // 4.1 handle odd lengthed palindrom (extends a function)
            int len1 = expandAroundCenter(s, i, i); // Odd length palindromes

            // 4.2 handle even lengthed palindrom (extends a function)
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes

            // 4.3 get the max between the two
            int len = Math.max(len1, len2);

            // 4.4 if the length is greater than the difference between
            // end and start update the start and left variable;
            if (len > end - start) {
                //4.4.1 update start to new palindromic length
                start = i - (len - 1) / 2;
                //4.4.2 update left to new palindromic length.
                end = i + len / 2;
            }
        }

        //5- return the palindrome substring
        return s.substring(start, end + 1);
    }

    //4.2 and 4.3 extends
    private int expandAroundCenter(String s, int left, int right) {

        //1 and 2 initiate left and right
        int L = left, R = right;

        // 3- loop while Left and right are within range
        // and character at left and right are same
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            //3.1 reduce the left
            L--;
            //3.2 increase the right
            R++;
        }

        //4 finally return range between left and right - 1
        return R - L - 1;
    }

    public static void main(String[] args) {
        LongestPalindromeString solution = new LongestPalindromeString();

        System.out.println(solution.longestPalindrome("babad")); // Output: "bab" or "aba"
        System.out.println(solution.longestPalindrome("cbbd"));  // Output: "bb"
    }
}
