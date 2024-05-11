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
        // allocate room by arrival time

        roomNumbers = getAllocateRoomByArrival(arrivalArray);



        System.out.println(Arrays.toString(roomNumbers));

        return new int[customers.length];
    }



    // method to return the minimum index of the array
    public static int[] getAllocateRoomByArrival(int[] array) {
        int[] arrRoom = new int[array.length];


        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            arrRoom[minIndex] = i+1;
            array[minIndex] = Integer.MAX_VALUE;

        }
        //System.out.println(Arrays.toString(arrRoom));
        return arrRoom;
    }

    // update allocated room by departure time
    public static int[] updateAllocatedRoom(int[] roomByArrival, int[] arrivalArray, int[] departureArray){


        return new int[roomByArrival.length];
    }


    public static void main(String[] args) {
        int[][] customers = {{5,2},{6,4}, {4,4}, {1,5}, {1,4}};
        //int[] singleArr = {3,4,5,6,8,1};

        int[] arr = allocateRooms(customers);

    // next to update the allocated room by the departure time......
    }
}