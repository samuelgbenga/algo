public class Main {

    private static int[] sorted = null;

// the find class the calls the recursive class
    public static int find (int x, int[] arr){
        Main.sorted = arr;
        return interpolationEngine(x, 0, Main.sorted.length-1);
    }

    // this is the recursive engine that does it
    private static int interpolationEngine(int x, int start, int end) {
       if(start == end){
         int value = sorted[start];
         if(x == value){ return start; }
         return Integer.MAX_VALUE;
       }
       // implementing the interpolation formula
       int mid = start + (end - start) * ((x - sorted[start]) / (sorted[end] - sorted[start]));
       // check if mid is within the array
       if(mid < start || mid > end){return Integer.MAX_VALUE;}
       // check if the elem at mid is the target
       if(sorted[mid] == x){
           return mid;
       }
       // call interpolationEngine recursively
       if(x > sorted[mid]){
           return interpolationEngine(x, mid+1, end) ;
       }
       if(x < sorted[mid]){
           return interpolationEngine(x, start, mid-1);
       }
        return Integer.MAX_VALUE;
    }
    //this is the print method
    public static void printArray (int[] arr){

        Main.sorted = arr;

        // handles the array printing
        System.out.print("{");
        for (int i = 0; i<arr.length; i++) {
            if( i != arr.length - 1) {
                System.out.print(arr[i] + " ,");
            }else {
                System.out.println(arr[i] + "}");
            }
        }

       // handle the result printing



    }
    // this is the main method
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,7,8};

        int result = find(8, arr1);

        printArray(arr1);
        System.out.println("this is the location of the item " + result);
    }
}