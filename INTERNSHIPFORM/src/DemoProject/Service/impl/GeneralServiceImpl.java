package DemoProject.Service.impl;

import DemoProject.Service.CourseService;
import DemoProject.model.Course;
import DemoProject.model.Teacher;

public class TeacherServiceImpl implements CourseService {

    @Override
    public void teachCourse(Teacher teacher, Course course) {
        System.out.println("Full name: "+ teacher.getName()+"\n"+ "Gender: "+ teacher.getGender()
        +"\n" + "Age: "+ teacher.getAge() + "\n" + "course taught:" + course.getCourseOffered()
        );
    }
}
