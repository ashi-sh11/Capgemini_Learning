package Task_04_02_2026.Generics.AI_DrivenResumeScreening;

abstract class JobRole {
    private String roleName;
    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleName() {
        return roleName;
    }
    public abstract boolean evaluateResume(String resume);
}
