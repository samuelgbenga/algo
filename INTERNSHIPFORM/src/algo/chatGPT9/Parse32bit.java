package algo.chatGPT9;

public class Parse32bit {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0, n = s.length();
        // Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Determine the sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Read the integer
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

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

