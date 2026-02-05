package Task_04_02_2026.Generics.CourseManagement;

class ExamCourse extends CourseType {

    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String evaluationMethod() {
        return "Final Written Exam";
    }
}
