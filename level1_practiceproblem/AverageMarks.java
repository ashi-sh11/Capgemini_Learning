package level1_practiceproblem;
public class AverageMarks {

    public static void main(String[] args) {

        String studentName = "Sam";

        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        double averageMarks =
                (mathsMarks + physicsMarks + chemistryMarks) / 3.0;

        System.out.println(
                studentName + "'s average mark in PCM is " + averageMarks
        );
    }
}
