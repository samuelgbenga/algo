package week_5.class_excercise10a;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {

    public static void main(String[] args) {
        List numbers = new ArrayList();

        numbers.add(30);
        numbers.add("samuel");


        System.out.println(numbers);
    }

    /*
    create one generic method give it a name make it generic.
    take that same method duplicate it multiple times with different datatype.
    use the overloading concept to overload

    create a generic class but should not take any type <T>
     */
}
