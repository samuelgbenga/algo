public class BinarySearch {
    public int[] arr = {1,5,9,11,20,80};

    public int binarySearchEngine(int x, int start, int end){
        // if not within the array return gibberish
        if(x > arr[end] || x < arr[start]){
            return Integer.MAX_VALUE;
        }
        // check if it is met already
        if(start == end && arr[start] == x){
            return start;
        }
        // the binary search formula
        int index = start + (end - start)/2;

        // check if the target has been met
        if(x == arr[index]){
            return index;
        }

        // move to left if not found
        if(x < arr[index]){
            return binarySearchEngine(x, start, index - 1);
        }
        // move to right if not found
        if(x > arr[index]){
            return binarySearchEngine(x, index + 1, end);
        }

        return Integer.MAX_VALUE;
    }




    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();
        // had to create the object of the class before i could call the array
        // static method cannot access nonstatic method or properties directly accept
        // an object of that class is created in that static method
        // also static methods can only be access through the class
        // e.g class.staticMethods or class.staticProperty.
        // it cannot be accessed through the class object.
       int xIndex = obj.binarySearchEngine(80, 0, obj.arr.length - 1);

        System.out.println("let see if it works: " + xIndex);

    }
}