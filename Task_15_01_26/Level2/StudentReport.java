package Task_15_01_26.Level2;

public class StudentReport {
    public static void main(String[] args) {

        Student student1 = new Student("Ashish", 101, 88.5);
        Student student2 = new Student("Rahul", 102, 72.0);

        System.out.println("Student 1 Report");
        student1.displayStudentReport();

        System.out.println("\nStudent 2 Report");
        student2.displayStudentReport();
    }
}


class Student {

    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }


    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayStudentReport() {
        System.out.println("Student Name   : " + name);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks          : " + marks);
        System.out.println("Grade          : " + calculateGrade());
    }
}
