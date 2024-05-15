package class_exercise_5a;

public abstract class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void display();
}
