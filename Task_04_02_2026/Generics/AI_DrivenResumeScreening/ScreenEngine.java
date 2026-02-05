package Task_04_02_2026.Generics.AI_DrivenResumeScreening;

class ScreeningEngine {
    public static <T extends JobRole> boolean screenResume(Resume<T> resume) {
        return resume.getJobRole()
                .evaluateResume(resume.getResumeText());
    }
}
