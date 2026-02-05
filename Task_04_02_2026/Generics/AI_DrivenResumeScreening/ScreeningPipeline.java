package Task_04_02_2026.Generics.AI_DrivenResumeScreening;
import java.util.*;

public class ScreeningPipeline {
    public static void processAll(List<? extends JobRole> roles, String resume) {
        for (JobRole role : roles) {
            boolean result = role.evaluateResume(resume);
            System.out.println(role.getRoleName() + " → " + (result ? "Selected" : "Rejected"));
        }
    }
}
