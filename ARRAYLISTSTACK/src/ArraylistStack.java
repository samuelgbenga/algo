import java.util.ArrayList;

class  StackUsingArrayList<T>{
    private final ArrayList<T> stackList;

    //set the constructor to initialize the object as an array list
    public StackUsingArrayList(){
        stackList = new ArrayList<>();
    }

    // check if arraylist is empty
    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    // push operation
    public void push(T elem){
        stackList.add(elem);
    }

    // pop operation

    public T pop(){
        if(isEmpty()){
            System.out.println("System is empty cannot pop: ");
            return null;
        }

        return stackList.removeLast();

    }

    public T peek(){
        if(isEmpty()) return null;
        return stackList.getLast();
    }

    public String printStack(){
        return stackList.toString();
    }

}



public class ArraylistStack {

    public static void main(String[] args) {

        StackUsingArrayList<String> stack = new StackUsingArrayList<>();

        stack.push("Samuel");
        stack.pop();
        stack.push("Joseph");
        stack.push("peter");
        stack.push("gbenga");
        stack.push("when you call my name");

        System.out.println(stack.printStack());
        // this will print an int
        StackUsingArrayList<Integer> stackInt = new StackUsingArrayList<>();

        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        stackInt.push(4);

        System.out.println(stackInt.printStack());






    }
}


