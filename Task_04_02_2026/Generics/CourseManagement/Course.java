package Task_04_02_2026.Generics.CourseManagement;

import java.util.*;

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    public void addCourse(T course) {
        courses.add(course);
    }
    public List<T> getCourses() {
        return courses;
    }
}
