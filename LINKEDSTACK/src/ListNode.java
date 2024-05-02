public class ListNode {
    private ListNode next;
    private final int data;

    public ListNode(){
        next = null;
        data = Integer.MAX_VALUE;
    }

    public ListNode(int data){
        this.data = data;
        next = null; //this might cause problem in the future(not sure).
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

//    public void setData(int data) {
//        this.data = data;
//    }

    public String toString(){
        return Integer.toString(data);
    }
}
