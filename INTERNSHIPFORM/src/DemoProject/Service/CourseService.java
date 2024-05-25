package DemoProject.Service;

import DemoProject.model.Course;
import DemoProject.model.Student;
import DemoProject.model.Teacher;

public interface CourseService {
    void teachCourse(Teacher teacher, Course course);

    void studentTakeCourse(Student student, Course course);

}
