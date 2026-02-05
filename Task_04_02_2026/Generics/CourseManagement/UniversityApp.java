package Task_04_02_2026.Generics.CourseManagement;

import java.util.List;

public class UniversityApp {
    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType course : list) {
            System.out.println(
                    course.getCourseName() + " → " + course.evaluationMethod()
            );
        }
    }
    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Algorithms"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Web Development"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));

        displayCourses(examCourses.getCourses());
        displayCourses(assignmentCourses.getCourses());
        displayCourses(researchCourses.getCourses());
    }
}
