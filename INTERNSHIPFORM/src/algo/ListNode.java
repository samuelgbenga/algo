package algo;

/*
checks for the presence of cycle in
a node list
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // A single node or an empty list cannot have a cycle
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // If fast reaches the end, there is no cycle
            }
            slow = slow.next; // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
        }

        return true; // If slow and fast meet, there is a cycle
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle

        System.out.println(solution.hasCycle(head)); // Output: true

        // Create a linked list without a cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        System.out.println(solution.hasCycle(head2)); // Output: false
    }

}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}