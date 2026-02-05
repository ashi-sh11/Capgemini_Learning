package Task_04_02_2026.Generics.CourseManagement;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract String evaluationMethod();
}
