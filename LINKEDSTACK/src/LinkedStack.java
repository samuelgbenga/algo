import java.util.EmptyStackException;

public class LinkedStack {

    private int length;
    private ListNode topNode;


    // constructor initiator
    public LinkedStack(){
        length = 0;
        topNode = null;
    };

    //push operation
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.setNext(topNode);
        topNode = temp;
        length++;

    };

    //pop operation
    public int pop() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int thePopped = topNode.getData();
        topNode = topNode.getNext();
        length--;
        return thePopped;
    }

    public boolean isEmpty(){
        return (length == 0);
    }

    public int peekNode() throws EmptyStackException{

        if(isEmpty())
            throw new EmptyStackException();

        return topNode.getData();
    }

    public int size(){
        return length;
    }
    public String toString(){

        StringBuilder result = new StringBuilder(" ");
        ListNode current = topNode;
        while(current != null){
            result.append(current).append(" \n ");
            current = current.getNext();
        }
        return result.toString();
    }






    public static void main(String[] args) {



        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(3);
        stack.push(16);
        stack.push(3000);
        System.out.print(stack);
        System.out.println("this is popped: "+stack.pop());
        System.out.println("print the size of the stack "+ stack.size());



        //System.out.println("Hello world!");

    }
}