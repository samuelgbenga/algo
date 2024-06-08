package week_7.practice1.algo_section2.algo12;

import java.math.BigInteger;
// Radix error (number format error) that bigInteger and long cant solve

public class NumberAndIPAddress{
    public static void main(String[] args) {
        System.out.println(convert("10.0.3.193")); // Output: 167773121
        System.out.println(convert("167773121"));// Output: 10.3.3.193

        //System.out.println(Integer.parseInt("4455"));
        System.out.println(2<<8);
    }

    public static String convert(String s) {
        if (s.contains(".")) {
            return ipToNum(s);
        } else {
            return numToIp(s);
        }
    }

    public static String ipToNum(String ip) {
        String[] parts = ip.split("\\.");
        long num = 0;
        for (String part : parts) {
            num = (num << 8) + Integer.parseInt(part);
        }
        return String.valueOf(num);
    }

    public static String numToIp(String num) {
        long numLong = Long.parseLong(num);
        String ip = "";
        for (int i = 0; i < 4; i++) {
            ip = (numLong & 0xFF) + "." + ip;
            numLong >>= 8;
        }
        return ip.substring(0, ip.length() - 1);
    }
}