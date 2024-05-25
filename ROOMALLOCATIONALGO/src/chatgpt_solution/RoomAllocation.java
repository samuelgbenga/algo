package chatgpt_solution;

import java.util.Arrays;

public class RoomAllocation {
    public static int[] allocateRooms(int[][] customers) {
        // Sort customers by their arrival day
        Arrays.sort(customers, (a, b) -> Integer.compare(a[0], b[0]));

        int[] allocations = new int[customers.length];
        int[] rooms = new int[customers.length];

        for (int i = 0; i < customers.length; i++) {
            int arrival = customers[i][0];
            int departure = customers[i][1];

            // Check if any room is available for the current customer
            boolean foundRoom = false;
            for (int j = 0; j < i; j++) {
                if (rooms[j] <= arrival) {
                    // Allocate the current room to the customer
                    allocations[i] = j + 1;
                    // Update the room's departure day
                    rooms[j] = departure;
                    foundRoom = true;
                    break;
                }
            }

            if (!foundRoom) {
                // If no available room found, allocate a new room
                allocations[i] = i + 1;
                rooms[i] = departure;
            }
        }

        return allocations;
    }

    public static void main(String[] args) {
        int[][] customers = {{1, 5}, {2, 4}, {6, 8}, {7, 7}};
        int[] allocations = allocateRooms(customers);
        System.out.println(Arrays.toString(allocations));  // Output: [1, 2, 1, 2]
    }
}

