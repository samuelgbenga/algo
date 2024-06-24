package week_7.practice1.algo_section3.algo7;
import java.util.*;


public class MatchingBrackets {

    public static boolean isValid(String s) {

        // initialize a mapp to contain the key value pair:
        // the opening to the closing bracket
        HashMap<Character, Character> mappy = new HashMap<>();
        mappy.put('(',')');
        mappy.put('[',']');
        mappy.put('{', '}');

        // returns false if the array is of even length
        if(s.length()%2 != 0) return false;


        // initialize flag to keep account of the number of open bracket
        // to make sure the number of closing bracket is equivalent to the number
        // of open bracket vice versa
        int flag = 0;
        // the for loops adds only opening brackets to the stack
        Stack<Character> stackList = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char chr = s.charAt(i);

            if(chr == '(' || chr == '{' || chr == '['){ // it adds only opening brackets to the stack;
                flag++;
                stackList.push(chr);
            }
            else if(!stackList.isEmpty()) {    //if not open it pops the open bracket
                char temp =  mappy.get(stackList.pop()); // and gets the value of the open
                if(chr != temp) return false; // it checks if the value of the open bracket is equivalent
                                                // to the current char value else return false.

            }
        }

        // lastly this returns true if the stack is empty and the number of the
        // open bracket is equal to the number of closing bracket. else return false
        return (stackList.isEmpty() && flag*2 == s.length())? true: false;

    }

    public static void main(String[] args) {
        System.out.println(isValid("{{{{{"));
        System.out.println(isValid("{{{{{}}}}}"));
        System.out.println(isValid("{}{}{}{}{}"));
        System.out.println(isValid("{(){}}{}{}{}{}"));

    }
}

