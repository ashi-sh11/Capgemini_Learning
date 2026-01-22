package Task_22_01_2026.SchoolAndStudents;

import java.util.*;

class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println(courseName + " Students:");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}

class School {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolStudents {
    public static void main(String[] args) {
        School school = new School();
        Student s1 = new Student("Ashish");
        Course c1 = new Course("Java");

        school.addStudent(s1);
        s1.enroll(c1);
        c1.showStudents();
    }
}

