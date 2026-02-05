package Task_04_02_2026.Generics.AI_DrivenResumeScreening;

import java.util.*;

public class ResumeScreeningApp {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResume =
                new Resume<>(new SoftwareEngineer(),
                        "Experienced in Java and Spring");

        Resume<DataScientist> dsResume =
                new Resume<>(new DataScientist(),
                        "Python, Machine Learning, Deep Learning");

        System.out.println(
                "SE Result: " + ScreeningEngine.screenResume(seResume)
        );

        System.out.println(
                "DS Result: " + ScreeningEngine.screenResume(dsResume)
        );

        List<JobRole> roles = Arrays.asList(
                new SoftwareEngineer(),
                new DataScientist(),
                new ProductManager()
        );

        ScreeningPipeline.processAll(
                roles,
                "Java, Roadmap, Stakeholder management"
        );
    }
}
