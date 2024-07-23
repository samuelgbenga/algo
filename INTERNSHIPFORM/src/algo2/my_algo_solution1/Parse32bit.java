package algo2.my_algo_solution1;

public class Parse32bit {





    public static void main(String[] args) {
      Parse32bit solution = new Parse32bit();

        // Test cases
        System.out.println(solution.myAtoi("42"));             // Output: 42
        System.out.println(solution.myAtoi("   -42"));         // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));       // Output: 1337
        System.out.println(solution.myAtoi("0-1"));            // Output: 0
        System.out.println(solution.myAtoi("words and 987"));  // Output: 0
    }

    private int myAtoi(String s) {



        if(s == null || s.length() == 0) return 0;

        // three major step after return default:
        // step1: ignore starting with space 1 to 4
        int i = 0, n = s.length();
        while( i < n && s.charAt(i) == ' ') i++;

        // step2: get the sign 5 - 6.2
        int sign = 1;
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){

            sign = (s.charAt(i) == '-') ? -1 : 1;

            i++;
        }

        // Step3: convert integer one at a time 7 - 8.4
        int result = 0;

        while(i< n && Character.isDigit(s.charAt(i))){
            //8.1
            int digit = s.charAt(i) - '0';

            //8.2
            if(result > (Integer.MAX_VALUE - digit) / 10)
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            //8.3
            result = result * 10 + digit;
            //8.4
            i++;

        }
        // return result

        return result * sign;
    }
}
