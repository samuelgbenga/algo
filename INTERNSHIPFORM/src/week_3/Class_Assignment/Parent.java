package week_3.Class_Assignment;

public class Parent {
   final private String color;

    public Parent(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "color='" + color + '\'' +
                '}';
    }
}
