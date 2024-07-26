package algo2.my_algo_solution2;

public class RegularExpressionMatching {





    public static void main(String[] args) {
        RegularExpressionMatching rem = new RegularExpressionMatching();
        System.out.println(rem.isMatch("aa", "a"));       // false
        System.out.println(rem.isMatch("aa", "a*"));      // true
        System.out.println(rem.isMatch("ab", ".*"));      // true
    }

    private boolean isMatch(String s, String p) {

        //step 1 to 4 intializtion
        int m = s.length();

        //2
        int n = p.length();

        //3
        boolean[][] isMatch = new boolean[m+1][n+1];

        //4
        isMatch[0][0] = true;

        // step 5 (check for . or * expression)
        for(int j = 2; j <= n; j++){

            // step 5.1
            if(p.charAt(j - 1) == '*')

                // step 5.1.1
                isMatch[0][j] = isMatch[0][j-2];

        }




        //step 6 ( do the actual regex after settling the first )
        for (int i = 1; i <= m; i++) {

            //step 6.1
            for (int j = 1; j <= n ; j++) {


                //step 6.1.1
                if(p.charAt(j-1) == '.' || p.charAt(j-1) == s.charAt(i-1)){

                    isMatch[i][j] = isMatch[i-1][j-1];

                }
                //step 6.1.2
                else if (p.charAt(j-1) == '*'){

                    //step 6.1.2.1
                    isMatch[i][j] = isMatch[i][j-2];

                    //step 6.1.2.2
                    if(p.charAt(j-2) == '.' || p.charAt(j-2) == s.charAt(i-1))
                        isMatch[i][j] = isMatch[i][j] || isMatch[i][j];

                }



            }

        }



        // step 7 returns the value


        return isMatch[m][n];
    }
}
