import java.util.Arrays;
import java.util.Objects;

public class GenericStack {
        @SuppressWarnings("unchecked")

    public static void main(String[] arg){
            @SuppressWarnings("rawtypes")
        GenericStackOfArray genericStack;
        genericStack = new GenericStackOfArray<>();


        genericStack.push(34);
        genericStack.push("samuel");
        genericStack.push(45);
        genericStack.push(true);
        genericStack.push(3.0);
        genericStack.push('c');
        System.out.println(genericStack);
        System.out.println("Hello world1");
    }
}

// the generic class that breaks the camel back
/*the entire line int shrinkSize = array.length>>1;
essentially calculates the length of the array (array.length)
and divides it by 2 using bitwise operations, storing the result in the shrinkSize variable.
*/


class GenericStackOfArray<T>{

    private final static int MIN_SIZE = 302;

    private int size = 0;

    // suppressed warning against the unchecked type T
    @SuppressWarnings("unchecked")
    // type cast T unto object
    private T[] array = (T[]) new Object[MIN_SIZE];

    // time for various method

    // push method first
    public void push(T elem){
        if(size>= array.length) grow();
        array[size++] = elem;
    }
    // pop method next
    public T pop(){
        if(size <= 0) return null;
        T top = array[--size];
        array[size]= null;

        int reduceSize = array.length/2;
        if(reduceSize>= MIN_SIZE && reduceSize > size){
            shrink();
        }

        return top;
    }
    // get top value
    public T peek(){

        if(size <= 0) return null;
        return array[--size];
    }

    // get value at index
    public T get(int index){
        if(index >=0 && index < size) return array[index];
        return null;
    }
    // check if the that value exist return true of false
    public boolean contain(T elem){
        for(int i=0; i<size; i++){
            T obj = array[i];
            if(obj.equals(elem)) return true;
        }
        return false;
    }
    //remove element at any index within the size and 0
    // first check if the element within
    public boolean remove(T elem){
        for(int i =0; i< size; i++){
            T obj = array[i];
            if(obj.equals(elem)) return (remove(i));
        }
        return false;
    }
    // this one does the removing
    private boolean remove(int index){
       //as long as it is not the last element on the stack
        if(index != --size){
            // deletes the element from wherever it is and adjust the size of tha array
            System.arraycopy(array, index+1, array, index, size-index);
        }
        array[size]= null;

        // reduce the size if needed
        int reduceSize = array.length/2;

        if(reduceSize>=MIN_SIZE && reduceSize > size) shrink();
        return true;
    }
    /*
    add later remove element by index
    *
    * */
    public T removeByIndex(int index){
        if(index >= 0 && index < size){
            T obj = array[index];
            if(index != --size){
                System.arraycopy(array, index+1, array, index, size-index);
            }
           array[size] = null;
            return obj;
        }
        return null;
    }
    //grow the array dynamically
    private void grow(){
        int newSize = array.length * 2;
        array= Arrays.copyOf(array, newSize);

    }
    // shrink the array size by 2 reason being there are empty spaces
    private void shrink(){
        int newSize = array.length / 2;
        array = Arrays.copyOf(array, newSize);

    }
    // check if the array contains the elem within the size and 0
    public boolean contains(T elem){
        for(int i = 0; i < size; i++){
            T obj = array[i];
            if(obj.equals(elem)) return true;
        }
        return false;
    }
    // return the size of the array
    public int size(){
        return size;
    }
    // clear the array
    public void clear(){
        size = 0;
    }
    //validate if the array is correct
    //check if null value is within the size
    //check if real value exist outside the size
    public boolean validate(){
        int mainSize = 0;
        for(int i = 0; i < array.length; i++){
            T obj = array[i];
            if(i<size) {
                if(obj == null) return false;
                mainSize++;
            }else if(obj!=null){
              return false;
            }
        }
        return (mainSize==size);
    }

    public String toString(){

       // return Objects.toString(array);
        StringBuilder str = new StringBuilder();
        for(int i = size - 1; i >=0; i--){

            if(i>0) str.append(array[i]).append(",");
            else str.append(array[i]);
        }
        return str.toString();
    }





}