package week_6.practice2;

public class AlgoAbstractFramework {

    public static void main(String[] args) {

        AlgoFramework.fromAbstractClass();
        System.out.println("****************");

        AlgoFramework rejoice = new RejoiceEatingSteps();

        String rejoiceEatingPattern = rejoice.eatingProcess();

        System.out.println(rejoiceEatingPattern);

        System.out.println("*********************");

        System.out.println("Hollow ");
    }
}

class RejoiceEatingSteps extends AlgoFramework{

    @Override
    String pray() {
        return "She prays";
    }

    @Override
    String takeSpoon() {
        return " she takes the spoon";
    }

    @Override
    String putTheFoodInMouth() {
        return " She the puts the food in her mouth.";
    }
}

abstract class   AlgoFramework {

    // Step to eat food.
    abstract String pray();
    abstract String takeSpoon();
    abstract String putTheFoodInMouth();

    String eatingProcess(){

         return (pray() + takeSpoon() + putTheFoodInMouth());
    }

    static void fromAbstractClass(){
        System.out.println("yes from the abstract");
    }





}