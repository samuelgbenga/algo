package algo1.my_algo_solution6;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseFromLeftToRight {

    public static ListNode reverseBetween(ListNode head, int left, int right){

        if(head == null || left == right) return head;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode prev = dummyNode;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode startNode = prev.next;
        ListNode current = prev.next.next;

        for (int i = 0; i < right - left; i++) {
            startNode.next = current.next;
            current.next = prev.next;
            prev.next = current;
            current = startNode.next;

        }
        return dummyNode.next;
    }


    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List: ");
        printList(head);

        ListNode reversedHead = reverseBetween(head, 2, 4);

        System.out.println("\nReversed List from position 2 to 4: ");
        printList(reversedHead);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
