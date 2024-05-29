package algo1.my_algo_solution3;


import org.w3c.dom.NodeList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}




public class RemoveTarget {

    public ListNode removeElements(ListNode head, int target){

//        ListNode dummyNode = new ListNode(0);
//        dummyNode.next = head;
//
//        ListNode current = dummyNode;
//
//        while(current.next != null){
//            if(current.next.val == target){
//                current.next = current.next.next;
//            }else{
//                current = current.next;
//            }
//        }

//        if(head == null) return head;
//
//        ListNode dummyNode = new ListNode(0);
//
//        dummyNode.next = head;
//
//        ListNode current = dummyNode;
//
//        while(current.next != null){
//            if(current.next.val == target){
//                current.next = current.next.next;
//            }else{
//                current = current.next;
//            }
//
//        }
//        return dummyNode.next;

        if(head == null) return null;

        ListNode dummyNodeList = new ListNode(0);
        dummyNodeList = head;
        ListNode current = dummyNodeList;


        while( current.next != null){

            if(current.next.val == target){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return dummyNodeList.next;
    }


    public static void main(String[] args) {
        RemoveTarget removeTarget = new RemoveTarget();

        // Test case 1: head = [1,2,6,3,4,5,6], val = 6
        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        head1 = removeTarget.removeElements(head1, 1);
        printList(head1); // Output: [1, 2, 3, 4, 5]

        // Test case 2: head = [], val = 1
        ListNode head2 = null;
        head2 = removeTarget.removeElements(head2, 1);
        printList(head2); // Output: []

        // Test case 3: head = [7,7,7,7], val = 7
        ListNode head3 = new ListNode(7, new ListNode(7, new ListNode(3, new ListNode(7))));
        head3 = removeTarget.removeElements(head3, 7);
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
