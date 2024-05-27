package week_6.class_activity1a;

public class InterfaceWithoutLambda {

    public static void main(String[] args) {

        int width = 10;

        // without lambda expression

        Drawable d1 = new Drawable() {
            @Override
            public void draw() {
                System.out.println(width + " Drawing width");
            }
        };

        d1.draw();


        Drawable d2 = () -> System.out.println(width + " Drawing width");

        d2.draw();

    }
}



interface Drawable{

    void draw();

}


