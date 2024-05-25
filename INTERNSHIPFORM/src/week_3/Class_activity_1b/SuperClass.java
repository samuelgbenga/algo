package week_3.Class_activity_1b;

public class SuperClass {

    private String name;

    public SuperClass(String name, int num){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Get name:" + getName());
    }
}
