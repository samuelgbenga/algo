public class LinearSearch {

    public static int orderedSearch(int x, int[] arr){

        int index = 1;
        for(int i= 0; i < arr.length; i++){
            if (x == arr[i]) {
                return i;
            }
            else if(arr[i] > x){
                return -1;
            }

        }
        return  index;
    }

    public static int unOrderedSearch(int x, int[] arr){


        for(int i= 0; i < arr.length; i++){
            if (x == arr[i]) {
                return i;
            }

        }
        return  Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = {10,7,3,4,3,6,5};
        int x = 5;
        int xIndex = unOrderedSearch(x,arr);
        int yIndex = orderedSearch(x, arr);


        System.out.printf("the element %d can be found in index: %d%n", x, xIndex);


        System.out.printf("the element %d can be found at index: %d%n ", x, yIndex);
    }
}