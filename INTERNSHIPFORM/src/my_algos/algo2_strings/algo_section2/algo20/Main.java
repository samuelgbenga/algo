package my_algos.algo2_strings.algo_section2.algo20;

/*

const character = "#";
const count = 8;
const rows = [];

function padRow(rowNumber, rowCount) {
  return " ".repeat(rowCount - rowNumber) + character.repeat(2 * rowNumber - 1) + " ".repeat(rowCount - rowNumber);
}
 */





public class Main {

    public static void main(String[] args) {
        int rowCount = 5; // example value
        char character = '*'; // example character

        for (int rowNumber = 1; rowNumber <= rowCount; rowNumber++) {
            String paddedRow = padRow(rowNumber, rowCount, character);
            System.out.println(paddedRow);
        }
    }

    public static String padRow(int rowNumber, int rowCount, char character) {
        String padding = " ".repeat(rowCount - rowNumber);
        String characters = String.valueOf(character).repeat(2 * rowNumber - 1);
        return padding + characters + padding;
    }
}
