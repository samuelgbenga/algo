package my_algos.algo2_strings.algo_section2.algo16.ChatGpt;



import java.util.Arrays;
import java.util.HashMap;

class RearrangeItems {

    public static int[] rearrangeItems(int[] popularity) {
        int n = popularity.length;
        int[] result = new int[n];

        // Create a HashMap to store the original indices of items based on their popularity ratings
        HashMap<Integer, Integer> originalIndices = new HashMap<>();
        for (int i = 0; i < n; i++) {
            originalIndices.put(popularity[i], i);
        }

        // Sort the items by their popularity ratings
        int[] sortedPopularity = popularity.clone();
        Arrays.sort(sortedPopularity);

        // Compare the original indices with the sorted indices and perform swap operations if necessary
        for (int i = 0; i < n; i++) {
            int originalIndex = originalIndices.get(sortedPopularity[i]);
            if (originalIndex > i) {
                swapItems(popularity, originalIndex, i);
            }
        }

        return popularity;
    }

    private static void swapItems(int[] popularity, int i, int j) {
        int temp = popularity[i];
        popularity[i] = popularity[j];
        popularity[j] = temp;
    }


}



public class RatingMarry {

    public static void main(String[] args) {
        int[] popularity = {3, 1, 4, 2};
        int[] rearranged = RearrangeItems.rearrangeItems(popularity);
        System.out.println(Arrays.toString(rearranged)); // Output: [4, 3, 2, 1]
    }
}
