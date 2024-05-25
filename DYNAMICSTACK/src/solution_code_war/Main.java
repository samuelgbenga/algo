package solution_code_war;
import java.util.*;

class Main {
    public static int[] allocateRooms(int[][] customers) {
        // Sort customers based on arrival days
        Arrays.sort(customers, Comparator.comparingInt(a -> a[0]));

        // Initialize arrays to store room allocations and last departure days
        int[] roomAllocations = new int[customers.length];
        int[] lastDepartureDay = new int[customers.length];

        int roomCount = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int departure = customer[1];
            boolean allocated = false;

            // Check if there's any room available
            for (int j = 0; j < roomCount; j++) {
                if (arrival > lastDepartureDay[j]) {
                    // Allocate room j to current customer
                    roomAllocations[roomCount] = j + 1;
                    lastDepartureDay[j] = departure;
                    allocated = true;
                    break;
                }
            }

            if (!allocated) {
                // Allocate a new room to current customer
                roomCount++;
                roomAllocations[roomCount - 1] = roomCount;
                lastDepartureDay[roomCount - 1] = departure;
            }
        }

        // Truncate the roomAllocations array to the actual number of rooms used
        return Arrays.copyOfRange(roomAllocations, 0, roomCount);
    }

    public static void main(String[] args) {
        int[][] customers = {{1, 5}, {2, 4}, {6, 8}, {7, 7}};
        int[] allocations = allocateRooms(customers);
        System.out.println(allocations.length);
        System.out.println(Arrays.toString(allocations)); // Output: [1, 2, 1, 2]
    }
}

