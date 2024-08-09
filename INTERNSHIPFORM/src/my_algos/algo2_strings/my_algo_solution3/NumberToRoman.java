package my_algos.algo2_strings.my_algo_solution3;

public class NumberToRoman {

    // hI Vite is Xiomi Latest Creation Dominating Model

    private static String intToRoman(int number){

        // step 1 array of numbers
       final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        // step 2 array of romans
        final String[] ROMANS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


        // step 3 initialize string builder
        StringBuilder result = new StringBuilder();


        // step 4.0 for loop through the length
        for(int i = 0; i<ROMANS.length; i++){

            // step 4.1 loop through while number is greater or equal the number at index
            while(number >= NUMBERS[i]){

                // step 4.1.1 append roman at index
                result.append(ROMANS[i]);

                // step 4.1.2 reduce the number by number at index
                number -= NUMBERS[i];

            }



        }


        return result.toString();
    }


    public static void main(String[] args) {
        // Example usage
        System.out.println(intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println(intToRoman(58));   // Output: "LVIII"
        System.out.println(intToRoman(1994)); // Output: "MCMXCIV"
    }
}
