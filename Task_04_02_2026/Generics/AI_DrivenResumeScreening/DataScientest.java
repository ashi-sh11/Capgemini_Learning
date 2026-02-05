package Task_04_02_2026.Generics.AI_DrivenResumeScreening;

class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public boolean evaluateResume(String resume) {
        return resume.contains("Python") || resume.contains("Machine Learning");
    }
}
