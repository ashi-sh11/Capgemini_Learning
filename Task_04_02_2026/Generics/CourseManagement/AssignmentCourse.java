package Task_04_02_2026.Generics.CourseManagement;

class AssignmentCourse extends CourseType {

    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String evaluationMethod() {
        return "Assignments and Projects";
    }
}
