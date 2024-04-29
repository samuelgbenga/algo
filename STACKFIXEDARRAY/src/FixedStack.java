public class FixedStack {

    protected int capacity;
    protected static final int CAPACITY = 30;
    protected int top = -1;
    protected int[] stackArr;

    // the first constructor
    public FixedStack(){
        this(CAPACITY);
    }
    public FixedStack(int cap){
        capacity = cap;
        stackArr = new int[capacity];
    }
    // isEmtpy
    public boolean isEmpty(){
        return(size() <= 0);
    }
    // size of array
    public int size(){
        return (top + 1);
    }
    // element at the top element
    public int topElem () throws Exception{
        if(isEmpty()) throw new Exception("The array is empty");
        return stackArr[top];
    }
    // push operation
    public void push(int data) throws Exception{
        if(size() == capacity) throw new Exception(" the stack is full already");
        stackArr[++top] = data;
    }
    // pop operation
    public int pop() throws Exception{
        int popElem;
        if(isEmpty()) throw new Exception("The stack is empty cannot pop");
        popElem= stackArr[top];
        stackArr[top--] = Integer.MIN_VALUE;
        return popElem;
    }
    // to string operation
    public String toString(){

        String s= "[";
        if(size()>0){
            s+= stackArr[0];
        }
        if(size() > 1){
            for(int i = 1; i < size(); i++){
                s+= "," + stackArr[i];
            }
        }
        return s + "]";
    }



    public static void main(String[] args) throws Exception{
        FixedStack stack = new FixedStack(3);

        System.out.println(stack.toString());

        //stack.pop();
        stack.push(3);
        System.out.println(stack.toString());
        stack.push(8);
        System.out.println(stack.toString());
        stack.push(10);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());

    }


}