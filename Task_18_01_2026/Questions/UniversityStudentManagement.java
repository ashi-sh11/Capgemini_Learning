package Task_18_01_2026.Questions;

public class UniversityStudentManagement {
}

class Student {
    private static String universityName = "Global Tech University";
    private static int totalStudents = 0;
    private String name;
    private final int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        totalStudents++;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public void displayStudentDetails() {
        System.out.println("University Name : " + universityName);
        System.out.println("Student Name    : " + name);
        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("Grade           : " + grade);
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public static void processIfValidStudent(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            student.displayStudentDetails();
        } else {
            System.out.println("Invalid object. Not a Student.");
        }
    }
}
