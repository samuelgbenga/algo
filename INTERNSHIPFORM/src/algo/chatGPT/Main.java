package algo.chatGPT;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(allNines(new BigInteger("11")));  // should return 9
        System.out.println(allNines(new BigInteger("12")));  // should return -1
        System.out.println(allNines(new BigInteger("17")));  // should return 76923
    }

    public static BigInteger allNines(BigInteger x) {
        BigInteger m = BigInteger.ONE;
        BigInteger result;
        int limit = 40000; // Upper limit of x

        while (true) {
            result = x.multiply(m);
            if (isAllNines(result.toString())) {
                return m;
            }
            if (m.compareTo(BigInteger.valueOf(limit * 9)) > 0) {
                return BigInteger.valueOf(-1);  // Break out if m exceeds a certain threshold
            }
            m = m.add(BigInteger.ONE);
        }
    }

    private static boolean isAllNines(String number) {
        for (char c : number.toCharArray()) {
            if (c != '9') {
                return false;
            }
        }
        return true;
    }
}
