package DemoProject.Service;

import DemoProject.model.Course;
import DemoProject.model.Principal;
import DemoProject.model.Student;

public interface StudentService {

    void displayStudentInfo(Student student, Course course);
    void isExpelled(Student student, Principal principal);
}
