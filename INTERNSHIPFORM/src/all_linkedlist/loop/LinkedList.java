package all_linkedlist.loop;

public class LinkedList {

    Node head;  // Pointer to the first node

    // Add a new node at the end
    void append(int data) {
        // init new node with data number
        Node newNode = new Node(data);
        // if head is null assign it to the head. first assignment return
        if (head == null) {
            head = newNode;
            return;
        }

        // else the already existing head
        Node temp = head;
        // from that head point to next
        while (temp.next != null) {
            // if there is an element apart from the head
            // go to the end
            temp = temp.next;
        }
        // then assign the new node to the next previously null
        temp.next = newNode;
    }

    // Loop through and print each element
    void printList() {
        Node temp = head;
        while (temp != null) {
            // while head is not null
            // print the data in that node
            System.out.print(temp.data + " -> ");
            // move to next
            temp = temp.next;
        }
        // print null
        System.out.println("null");
    }

    public static void main(String[] args) {

            LinkedList list = new LinkedList();
            list.append(10);
            list.append(20);
            list.append(30);
            list.append(40);

            // Loop through and print the list
            list.printList();  // Output: 10 -> 20 -> 30 -> 40 -> null

    }
}


