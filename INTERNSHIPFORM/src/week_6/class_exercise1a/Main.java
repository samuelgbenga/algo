package week_6.class_exercise1a;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("sam", 12));
        students.add(new Student("handy", 42));
        students.add(new Student("amy", 62));

        students.sort((a,b)-> Character.compare(a.getName().charAt(0), b.getName().charAt(0)));

        //students.sort(Comparator.comparing(Student::getName));

        students.forEach(System.out::println);
//        students.forEach(student ->
//                System.out.println(student.getName()));


    }
}
class Student{
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
