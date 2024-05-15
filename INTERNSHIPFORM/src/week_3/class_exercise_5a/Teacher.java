package class_exercise_5a;

public class Teacher extends Person{
    public Teacher(int age, String name) {
        super(age, name);
    }

    @Override
    void display() {
        System.out.println("Teacher Name: "+ getName() + " \nTeacher age: "+ getAge());
    }
}
