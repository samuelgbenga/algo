package week_5.class_excercise4a;

public class Fruit {

    private final String name;
    private final String color;

    public Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }
    @Override
    public String toString(){
        return(color+" "+name);
    }
}
