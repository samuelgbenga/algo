package week_3.class_exercise_5a;

public class Student extends Person{
    public Student(int age, String name) {
        super(age, name);
    }

    @Override
    void display() {
        System.out.println("Student Name: "+ getName() + " \nStudent age: "+ getAge());
    }
}
