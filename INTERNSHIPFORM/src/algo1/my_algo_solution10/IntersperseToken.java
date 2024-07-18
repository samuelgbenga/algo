package algo1.my_algo_solution10;

public class IntersperseToken {





    // solution to the intersperse algorithm that was given to me
    // recket dev



    public static void main(String[] args) {
        String mainString = "H-e-l-l-o";
        String token = "sucorthabitha";
        int interval = 1;

        String result = intersperse(mainString, token, interval);
        System.out.println(result);  // Output: He-ll-oW-or-ld
    }

    private static String intersperse(String mainString, String token, int interval) {

        //1 default return
        if(mainString == null || token == null || interval <= 0) return mainString;

        //2 instantiate builder result
        StringBuilder str = new StringBuilder();

        //3 instantiate length to equal string length
        int strLen = mainString.length();

        //4 loop through to append to result token and string
        for (int i = 0; i < strLen; i++) {

            //4.1 append the string
            str.append(mainString.charAt(i));

            //4.2 append the token with the token login
            if( i < strLen - 1){
                if(i <token.length() ){
                        str.append(token.charAt(i));
                }
            }
            else {
                str.append(token.substring(i));
            }
        }

        //5 return result
        return str.toString();
    }
}
