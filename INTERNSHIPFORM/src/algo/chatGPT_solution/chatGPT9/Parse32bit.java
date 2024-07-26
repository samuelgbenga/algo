package algo.chatGPT_solution.chatGPT9;

public class Parse32bit {
    public int myAtoi(String s) {

        //1 return default
        if (s == null || s.length() == 0) {
            return 0;
        }

        // 2,3, instantiate i = 0 and n = length of string
        int i = 0, n = s.length();

        //4. Ignore leading whitespace using while loop i tought trim would be better
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Determine the sign
        // 5. instantiant sign = 1
        int sign = 1;

        // 6. check if the next char is - or  +
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            //6.1 reasign sign to -1 or 1 if char at i is -
            sign = (s.charAt(i) == '-') ? -1 : 1;

            //6.2 increase i
            i++;
        }

        // Read the integer
        //7 assign result = 0
        int result = 0;

        //8 loop through while i < n and character is a digit (Character.isDigit())
        while (i < n && Character.isDigit(s.charAt(i))) {

            //8.1 convert to integer
            int digit = s.charAt(i) - '0';

            // Check for overflow/underflow
            //8.2 check for over flow result < 2 raise to power 31 return aproximate value
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            //8.3 add up result
            result = result * 10 + digit;

            //8.4 increase i
            i++;
        }

        //9 multiply the sign and return
        return result * sign;
    }

    public static void main(String[] args) {
        Parse32bit solution = new Parse32bit();

        // Test cases
        System.out.println(solution.myAtoi("42"));             // Output: 42
        System.out.println(solution.myAtoi("   -42"));         // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));       // Output: 1337
        System.out.println(solution.myAtoi("0-1"));            // Output: 0
        System.out.println(solution.myAtoi("words and 987"));  // Output: 0
    }
}

