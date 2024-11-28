package my_algos.algo2_strings.polish_notation;

import java.util.Stack;

public class ReversePolishNotation2 {



    // check value is digit,  stack push
    // check if value is operator, pop two eles from st, perform operation and push back.
    //return st.top in end.
    // this is a genius solution right there
    public static int evalRPN(String[] tokens) {
        String oprs = "+-*/";
        Stack<String> st = new Stack();
        for(String value: tokens) {
            //String value = tokens[i];
            if(oprs.contains(value)) {
                int num1 = Integer.valueOf(st.pop());
                int num2 = Integer.valueOf(st.pop());
                if(value.equals("+")) {
                    st.push(Integer.toString(num1 + num2));
                } else if(value.equals("-")) {
                    st.push(Integer.toString(num2 - num1));
                } else if(value.equals("*")) {
                    st.push(Integer.toString(num1 * num2));
                } else if(value.equals( "/")) {
                    st.push(Integer.toString(num2 / num1));
                }

            } else {
                st.push(value);
            }
        }
        return Integer.valueOf(st.pop());
    }


    public static void main(String[] args) {


        String[] chaArr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(chaArr));

    }
}
