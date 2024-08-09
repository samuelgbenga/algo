package my_algos.algo1.my_algo_solution1;


import java.util.LinkedList;
/*
my solution
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class MiddleOfLinkedList {
    public ListNode middleNode (ListNode head){
        //        if(head == null){
//            return null;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;

//        if(head == null) return head;
//
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//       return slow;

        if(head == null) return null;

        ListNode slow = head.next;
        ListNode fast = head;

        while(fast != null && fast.next != null ){

            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }



    // boilerplate
    public static void main(String[] args) {
       MiddleOfLinkedList solution = new MiddleOfLinkedList();

        // Test case 1: [1,2,3,4,5]
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode middle1 = solution.middleNode(head1);
        printList(middle1); // Output: [3, 4, 5]

        // Test case 2: [1,2,3,4,5,6]
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode middle2 = solution.middleNode(head2);
        printList(middle2); // Output: [4, 5, 6]
    }

    // Helper function to print the linked list from the given node
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
