package DemoProject.Service.impl;

import DemoProject.Service.CourseService;
import DemoProject.Service.ApplicantService;
import DemoProject.Service.PrincipalService;
import DemoProject.Service.StudentService;
import DemoProject.model.*;

public class GeneralServiceImpl implements CourseService, ApplicantService, PrincipalService, StudentService {

    @Override
    public void teachCourse(Teacher teacher, Course course) {
        System.out.println("Full name: "+ teacher.getName()+"\n"+ "Gender: "+ teacher.getGender()
        +"\n" + "Age: "+ teacher.getAge() + "\n" + "course taught:" + course.getCourseOffered()
        );
    }

    @Override
    public void studentTakeCourse(Student student, Course course) {
        System.out.println("Full name: "+ student.getName()+"\n"+ "Gender: "+ student.getGender()
                +"\n" + "Age: "+ student.getAge() + "\n" + "course offered:" + course.getCourseOffered()
        );
    }

    // implement applicant service here
    @Override
    public void displayApplicantInfo(Applicant applicant) {
        System.out.println("Full name: "+ applicant.getName()+"\n"+ "Gender: "+ applicant.getGender()
                +"\n" + "Age: "+ applicant.getAge()
        );

    }

    @Override
    public void admitted(Applicant applicant) {
        if(applicant.getAge() >=18){
            System.out.println("Congratulations you have been admitted: "+ applicant.getName());
        }
        else {
            System.out.println("We are sorry. you have not been admitted: "+ applicant.getName());
        }

    }

    // implement principal service here
    @Override
    public void displayPrincipalInfo(Principal principal) {

        System.out.println("Full name: "+ principal.getName()+"\n"+ "Gender: "+ principal.getGender()
                +"\n" + "Age: "+ principal.getAge()
        );

    }

    // implement student service here
    @Override
    public void displayStudentInfo(Student student, Course course) {
        System.out.println("Full name: "+ student.getName()+"\n"+ "Gender: "+ student.getGender()
                +"\n" + "Age: "+ student.getAge() + "\n" + "course offered: " + course
        );

    }

    @Override
    public void isExpelled(Student student, Principal principal) {

        System.out.println("Student Full name: "+ student.getName()+"\n"+ "Expulsion Duration: 2 Weeks"
                +"\n" + "Student Expelled by: "+ principal.getName()
        );

    }

    //
}
