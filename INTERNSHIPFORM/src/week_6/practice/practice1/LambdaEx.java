package week_6.practice.practice1;

public class LambdaEx {

    public static void main(String[] args) {
        MathOperation doMath = ()-> System.out.println("it worked");
        doTheThing(doMath);
        // accessing static method in an interface.
        MathOperation.doSomething();

    }

// this method runs our interface method that does the thing by just calling and passing
    // the interface into the method.
    // hiding the underlying method that actually does it from
    // the surface word.
    public static void doTheThing(MathOperation theThing){
        theThing.doMathOperation();
    }
}


@FunctionalInterface
interface MathOperation{
    int x = 1;
    int y = 2;
    void doMathOperation();
    static void doSomething(){
        System.out.println(x+ y);
    }
}

