package algo;

public class AllNines {


}

 class Main {
    public static void main(String[] args) {
        for (int x = 1; x <= 4000; x++) {
            System.out.println("x = " + x + ", m = " + findSmallestM(x));
        }
    }

    public static int findSmallestM(int x) {
        if (x <= 0 || x > 4000) {
            return -1;
        }

        int modulus = 9 * x;
        long current = 1;
        int k = 1;

        while (k <= modulus) {
            if (current % modulus == 1) {
                return (int) (current / x);
            }
            current = current * 10 + 1;
            k++;
        }

        return -1;
    }
}
