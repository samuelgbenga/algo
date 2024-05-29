package algo1.my_algo_solution5;

import algo.chatGPT2.PalindromeLinkedList;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class PalindromeListNode {

    public boolean isPalindrome(ListNode head){

        if (head == null) return true;
        boolean isPalindrome = true;


        // to get the middle node.
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfHead = reverseList(slow);
        ListNode firstHalfHead = head;

        while(secondHalfHead != null){
            if(secondHalfHead.val != firstHalfHead.val){
                isPalindrome = false;
                break;
            }
            secondHalfHead = secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }

        return isPalindrome;
    }




    public static void main(String[] args) {
        PalindromeListNode solution = new PalindromeListNode();
        // Create test cases and test the solution
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(solution.isPalindrome(head1)); // Output: true

        ListNode head2 = new ListNode(1, new ListNode(2));
        System.out.println(solution.isPalindrome(head2)); // Output: false

        ListNode head3 = null;
        System.out.println(solution.isPalindrome(head3));

        ListNode restoredList = reverseList(head2);
        while(restoredList != null){
            System.out.println(restoredList.val);
            restoredList = restoredList.next;
        }

    }
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
