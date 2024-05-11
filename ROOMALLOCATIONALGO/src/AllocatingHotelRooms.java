import java.util.Arrays;

public class AllocatingHotelRooms {
    public static int[] allocateRooms(int[][] customers) {

        // initialize three arrays roomNo, arrivalArray, and DepartureArray
        int[] roomNumbers = new int[customers.length];
        int[] arrivalArray = new int[customers.length];
        int[] departureArray = new int[customers.length];

        // for loop to assign element
        int counter = 0;
        for(int[] customer: customers){
            arrivalArray[counter] = customer[0];
            departureArray[counter]= customer[1];
            counter++;
        }

        // lets get index with min arrival date
//        int minArrival = getMinIndex(arrivalArray);
//
//        roomNumber[minArrival] = 1;

       roomNumbers = roomAllocationByArrival(arrivalArray);



        //System.out.println(Arrays.toString(roomNumbers));
        return new int[customers.length];
    }

    // method to return room allocation in ascending order
    public static int[] roomAllocationByArrival(int[] arrivalArray){

        // allocate room by arrival date in ascending numerical order
        int[] arrivalArr = new int[arrivalArray.length];
        int roomNumber = 0;
        for (int i = arrivalArray.length; i >= 0 ; i--) {
            roomNumber++;
                int minIndex = getMinIndex(arrivalArray);
                arrivalArr[minIndex] = roomNumber;
            System.out.println(minIndex);
                arrivalArray = removeIndex(minIndex, arrivalArray);

        }
        return arrivalArr;
    }

    // method to return the minimum index of the array
    public static int getMinIndex(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // method to remove detected index
    public static int[] removeIndex(int index, int[] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        // let's try it
        System.arraycopy(array, index+1, array, index, array.length-index-1);
        array[array.length-1]= 0;
        return array;
    }

    public static void main(String[] args) {
        int[][] customers = {{5,2},{6,4}, {4,4}};
       // int[] singleArr = {3,4,5,6,3,7};

        int[] arr = allocateRooms(customers);

        //int[] testing = removeIndex(2,singleArr);

        //System.out.println(Arrays.toString(testing));
    }
}