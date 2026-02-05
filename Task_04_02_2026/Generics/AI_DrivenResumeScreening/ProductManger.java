package Task_04_02_2026.Generics.AI_DrivenResumeScreening;

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
    @Override
    public boolean evaluateResume(String resume) {
        return resume.contains("Roadmap") || resume.contains("Stakeholder");
    }
}
