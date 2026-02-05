package Task_04_02_2026.Generics.AI_DrivenResumeScreening;

class Resume<T extends JobRole> {
    private T jobRole;
    private String resumeText;
    public Resume(T jobRole, String resumeText) {
        this.jobRole = jobRole;
        this.resumeText = resumeText;
    }
    public T getJobRole() {
        return jobRole;
    }
    public String getResumeText() {
        return resumeText;
    }
}
