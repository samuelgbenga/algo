package DemoProject.model;

import DemoProject.enums.CourseOffered;

public class Course {

    final private CourseOffered courseOffered;

    public Course(CourseOffered courseOffered){
        this.courseOffered = courseOffered;
    }

    public CourseOffered getCourseOffered() {

        return courseOffered;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseOffered=" + courseOffered +
                '}';
    }
}
