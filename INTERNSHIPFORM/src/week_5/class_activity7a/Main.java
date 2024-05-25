package week_5.class_activity7a;

public class Main {

    public static void main(String[] args) {
        GradeTracker gradeTracker = new GradeTracker();

        gradeTracker.addGrade(1,20.0);
        gradeTracker.addGrade(2,21.0);
        gradeTracker.addGrade(3,22.0);
        gradeTracker.addGrade(4,23.0);
        gradeTracker.addGrade(5,24.0);
        gradeTracker.addGrade(6,25.0);
        gradeTracker.addGrade(7,25.0);
        gradeTracker.addGrade(8,25.0);
        gradeTracker.addGrade(9,27.0);

        System.out.println(gradeTracker.getGrade(10));


    }
}
