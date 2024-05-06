import java.util.Arrays;

public class DynamicStack {
    private int mxSize;
    private int top;
    private int[] stackArray;

    public DynamicStack(int size) throws Exception{
        mxSize = size;
        stackArray = new int[mxSize];
        top= -1;

    }

    // check the top element
    public int peek(){
        if(!isEmpty()){
            return stackArray[top];
        }
        System.out.println("stack is empty");
        return top;
    }

    // pop item
    public int pop() throws Exception{

        if(!isEmpty()){
            int elementPopped = stackArray[top--];
            stackArray[top + 1] = 0;
            return elementPopped;
        }
        return -1;
    }
    // push method
    public void push(int x) throws Exception{
       if(isFull()){

           resize(mxSize * 2);
           push(x);
       }
       else{
           stackArray[++top] = x;
       }


    }

    //resize the dynamic stack
    public void resize(int newSize) throws Exception{

        try{
            if(newSize > stackArray.length){
                int[] newArray = new int[newSize];
                System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
                stackArray = newArray;
                mxSize = newSize;

            }

        }catch(Exception e){
            System.out.println("this is the Error: " + e.getMessage());
        }



    }
    // check it the stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }
    // check if the stack is full
    public boolean isFull(){
        return (top + 1 == mxSize);
    }
    public void empty(){
        top = -1;
    }

    public String printArrString(){
        return Arrays.toString(stackArray);
    }






    public static void main(String[] args) throws Exception{



        DynamicStack stack = new DynamicStack(5);

        stack.pop();
        stack.push(2);
        stack.push(26);
        stack.push(2);
        stack.push(26);
        stack.push(26);
        stack.push(1);



        System.out.println(stack.printArrString());

        System.out.println("This is the top Element: "+stack.peek());
        System.out.println("The element popped: "+stack.pop());
        System.out.println(stack.printArrString());

        System.out.println("***********************");
        System.out.println("The element popped: "+stack.pop());
        System.out.println("This is the top Element: "+stack.peek());
        System.out.println(stack.printArrString());

        System.out.println("***********************");
        System.out.println("The element popped: "+stack.pop());
        System.out.println("This is the top Element: "+stack.peek());
        System.out.println(stack.printArrString());

        System.out.println("***********************");
        System.out.println("The element popped: "+stack.pop());
        System.out.println("This is the top Element: "+stack.peek());
        System.out.println(stack.printArrString());

        System.out.println("***********************");
        System.out.println("The element popped: "+stack.pop());
        System.out.println("This is the top Element: "+stack.peek());
        System.out.println(stack.printArrString());

        System.out.println("***********************");
        System.out.println("The element popped: "+stack.pop());
        System.out.println("This is the top Element: "+stack.peek());
        System.out.println(stack.printArrString());

        System.out.println("***********************");
        System.out.println("The element popped: "+stack.pop());
        System.out.println("This is the top Element: "+stack.peek());
        System.out.println(stack.printArrString());







//        int[] arr = {1,2,3,4};
//        int[] arr1 = {5,6,7,6};
//
//        arr = arr1;
//        int[] transferArray = new int[10];
//
//        for(int i: arr){
//            // this implements the enhance array
//            System.out.println(i);
//        }
//        System.out.println("Hello world!:");
//
//        System.arraycopy(arr, 0, transferArray, 0, arr.length);
//        arr = transferArray;
//
//
//        for(int i: arr){
//            // this implements the enhance array
//            System.out.println(i);
//        }
//
//        System.out.println("Hello world!: " + (-1 < 0));
    }
}