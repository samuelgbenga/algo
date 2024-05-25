package week_3.class_exercise_5a;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(23, "samuel gbenga");
        Student student = new Student(45, "Peter Joseph");


        System.out.println("Teachers info");
        teacher.display();
        System.out.println("*******************");

        System.out.println("Student info");
        student.display();
        System.out.println("*******************");
    }
}
