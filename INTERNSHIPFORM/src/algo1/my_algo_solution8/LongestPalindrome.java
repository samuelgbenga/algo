package algo1.my_algo_solution8;

public class LongestPalindrome {

    public String longestPalindrome(String s) {

        //1 return null if empty
        if(s == null || s.length() == 0) return "";

        //2 instantiate the right or end
        int right = 0;

        //3 instatiate left / start
        int left = 0;



        //4 loop through the string using for loop
        for (int i = 0; i < s.length(); i++) {

            //4.1 is to instantiate start lenght for even palindrom
            int len1 = evenOrOddLength(s, i, i);

            //4.2 is to instantiate end length length for odd palindrom
            int len2 = evenOrOddLength(s, i, i+1);


            //4.3 returnthe max of both
            int len = Math.max(len1, len2);

            //4.4 if max len is greater that right and left update right and left
            if(len > right - left){
                //4.4.1 update the left side
                left = i - (len-1)/2;

                //4.4.2 update the right sid
                right = i + len/2;
            }


        }

      return s.substring(left, right+1);
    }

    // function that settles odd or even lenght palindrome
    private int evenOrOddLength(String str, int left, int right){
        int l = left;
        int r = right;

        while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)){
            l--;
            r++;
        }



        return r-l-1;
    }




    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();

        System.out.println(solution.longestPalindrome("babad")); // Output: "bab" or "aba"
        System.out.println(solution.longestPalindrome("cbbd"));  // Output: "bb"
    }
}