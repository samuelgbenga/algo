package my_algos.algo1.my_algo_solution2;



/*
my solution
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class NoCycleNode {

    public  boolean hasCycle(ListNode head){
//
//        if(head == null || head.next == null) return false;
//
//        ListNode fast = head.next;
//        ListNode slow = head;
//
//        while( fast != null && fast.next != null){
//
//            if(fast == slow) return true;
//
//            fast = fast.next.next;
//            slow = slow.next;
//
//        }
//
//        return false;

//        if(head == null || head.next == null) return false;
//
//        ListNode slow = head;
//        ListNode fast = head.next;
//
//        while(fast != slow){
//            if(fast == null || fast.next == null) return false;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return true;
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != slow){
            if( fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }



    public static void main(String[] args) {
        NoCycleNode noCycleNode = new NoCycleNode();

        // Create a linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle

        System.out.println(noCycleNode.hasCycle(head)); // Output: true

        // Create a linked list without a cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        System.out.println(noCycleNode.hasCycle(head2)); // Output: false
    }
}
