package Task_04_02_2026.Generics.AI_DrivenResumeScreening;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
    @Override
    public boolean evaluateResume(String resume) {
        return resume.contains("Java") || resume.contains("Spring");
    }
}
