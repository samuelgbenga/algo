package Testing;

public class FindSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,0,5,6};
        int firstIndex = -1;
        int secondIndex = -1;
        int checkSum = 5;
        for(int i = 0; i<arr.length-1; i++){

            for(int j = i; j<arr.length; j++){
                if(arr[i] + arr[j] == checkSum){
                   firstIndex = i;
                   secondIndex = j;
                    System.out.println("found at index: " + firstIndex + "and" + secondIndex);
                }
            }

        }

    }


    /*
    write an algorithm to return the index of two numbers in an array that gives a targeted sum

     */
}
