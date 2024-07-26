package algo.chatGPT_solution.chatGPT4;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Use a current pointer starting from dummy node
        ListNode current = dummy;

        // Traverse the list
        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with the given value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        // Return the new head (dummy.next)
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();

        // Test case 1: head = [1,2,6,3,4,5,6], val = 6
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        head1 = solution.removeElements(head1, 6);
        printList(head1); // Output: [1, 2, 3, 4, 5]

        // Test case 2: head = [], val = 1
        ListNode head2 = null;
        head2 = solution.removeElements(head2, 1);
        printList(head2); // Output: []

        // Test case 3: head = [7,7,7,7], val = 7
        ListNode head3 = new ListNode(7, new ListNode(7, new ListNode(3, new ListNode(7))));
        head3 = solution.removeElements(head3, 7);
        printList(head3); // Output: []
    }

    // Helper function to print the linked list
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}

