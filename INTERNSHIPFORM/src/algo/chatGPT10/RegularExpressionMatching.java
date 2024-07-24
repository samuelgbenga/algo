package algo.chatGPT10;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        //1 - length of s
        int m = s.length();

        //2 - length of p
        int n = p.length();

        //3- multildime of array boolean initialization
        boolean[][] dp = new boolean[m + 1][n + 1];

        //4 - set the first to true (0,0)
        dp[0][0] = true;

        //5 Initialize dp for patterns like a*, a*b*, a*b*c* etc.
        // loop through from 2 t0 n = length of p
        for (int j = 2; j <= n; j++) {

            //5.1 if item at j-1 is equal *
            if (p.charAt(j - 1) == '*') {

                //5.1.1 asign j to j-2 in the multidimentional array
                dp[0][j] = dp[0][j - 2];
            }
        }

        // 6 loop through the string
        for (int i = 1; i <= m; i++) {


            //6.1 loop through the p partern
            for (int j = 1; j <= n; j++) {

                //6.1.1 if p ath j-1 matches . or matches the character at s at same index
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {

                    // 6.1.1.1 update ij to i-1,j-1
                    dp[i][j] = dp[i - 1][j - 1];

                }
                // 6.1.2 if partern matches * at j-1
                else if (p.charAt(j - 1) == '*') {

                    //6.1.2.1 update ij to i,j-2
                    // 0 occurrence of the character before '*'
                    dp[i][j] = dp[i][j - 2];

                    //6.1.2.2 if p at j-2  is . or p at j-2 matches s at i - 1
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {

                        //6.1.2.3 or operation to update to true or false;
                        // 1 or more occurrence of the character before '*'
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        RegularExpressionMatching rem = new RegularExpressionMatching();
        System.out.println(rem.isMatch("aa", "a"));       // false
        System.out.println(rem.isMatch("aa", "a*"));      // true
        System.out.println(rem.isMatch("ab", ".*"));      // true
    }
}
