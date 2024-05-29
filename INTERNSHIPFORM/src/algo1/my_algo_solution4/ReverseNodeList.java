package algo1.my_algo_solution4;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}




public class ReverseNodeList {


    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while(current != null){

            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
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

        ListNode reversedHead = reverseList(head);

        System.out.println("\nReversed List: ");
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
