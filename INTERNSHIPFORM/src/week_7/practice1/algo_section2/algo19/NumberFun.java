package week_7.practice1.algo_section2.algo19;

public class NumberFun {
    public static long findNextSquare(long sq) {

        double num = Math.sqrt(sq);
        return (num - (int)num != 0) ? -1 : (long) Math.pow((Math.sqrt(sq)+1),2);

    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(17));
        System.out.println(findNextSquare(25));
        System.out.println(findNextSquare(90));
        System.out.println(findNextSquare(81));
    }
}
