package Task_04_02_2026.Generics.CourseManagement;

class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String evaluationMethod() {
        return "Research Paper and Presentation";
    }
}
