package algo.chatGPT2;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalfStart = reverseList(slow);

        // Step 3: Compare the first half and the reversed second half
        ListNode firstHalfStart = head;
        ListNode secondHalfIter = secondHalfStart;
        boolean isPalindrome = true;
        while (secondHalfIter != null) {
            if (firstHalfStart.val != secondHalfIter.val) {
                isPalindrome = false;
                break;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfIter = secondHalfIter.next;
        }

        // Step 4: Restore the list (optional)
        reverseList(secondHalfStart);

        // Step 5: Return the result
        return isPalindrome;
    }

    private ListNode reverseList(ListNode head) {
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

    public static void main(String[] args) {
        PalindromeLinkedList solution = new PalindromeLinkedList();
        // Create test cases and test the solution
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(solution.isPalindrome(head1)); // Output: true

        ListNode head2 = new ListNode(1, new ListNode(2));
        System.out.println(solution.isPalindrome(head2)); // Output: false
    }
}
