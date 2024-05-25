package DemoProject;

import DemoProject.Service.impl.GeneralServiceImpl;
import DemoProject.enums.CourseOffered;
import DemoProject.enums.Gender;
import DemoProject.model.*;

import javax.xml.transform.Source;

public class SchoolSystem {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Samuel Gbenga", 123, Gender.FEMALE);
        Teacher teacher2 = new Teacher("Samuel Abija", 12, Gender.MALE);

        Student student1 = new Student("Oladipupo wale", 30 , Gender.MALE);
        Student student2 = new Student("weblink", 12 , Gender.FEMALE);

        Principal principal = new Principal("David Bamiloye", 40, Gender.MALE);

        Applicant applicant = new Applicant("Agbaje Dada", 17, Gender.FEMALE);

        Course course1 = new Course(CourseOffered.BLABLABLA);
        Course course2 = new Course(CourseOffered.CHEMISTRY);

        GeneralServiceImpl teacherService1 = new GeneralServiceImpl();
        GeneralServiceImpl teacherService2 = new GeneralServiceImpl();

        GeneralServiceImpl studentService1 = new GeneralServiceImpl();
        GeneralServiceImpl studentService2 = new GeneralServiceImpl();

        GeneralServiceImpl principalService = new GeneralServiceImpl();

        GeneralServiceImpl applicantService = new GeneralServiceImpl();



        System.out.println("Teacher one Data");
        teacherService1.teachCourse(teacher1, course1);
        System.out.println("*******************************");

        System.out.println("Teacher two Data");
        teacherService2.teachCourse(teacher2, course2);
        System.out.println("*******************************");

        System.out.println("Student One Info");
        studentService1.studentTakeCourse(student1, course1);
        System.out.println("*******************************");
        System.out.println("Student Two Info");
        studentService2.studentTakeCourse(student2, course2);
        System.out.println("*******************************");

        System.out.println("Principal Data");
        principalService.displayPrincipalInfo(principal);
        System.out.println("*******************************");

        System.out.println("Applicant Info");
        applicantService.displayApplicantInfo(applicant);
        System.out.println("*******************************");

        System.out.println("Applicant Info");
        applicantService.admitted(applicant);
        System.out.println("*******************************");

        System.out.println("Student Expulsion Status");
        studentService1.isExpelled(student1, principal);
        System.out.println("********************************");

    }
}
