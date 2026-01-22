package Task_22_01_2026.UniversityManagementSystem;

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course c) {
        System.out.println(name + " assigned to course");
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course c) {
        System.out.println(name + " enrolled in course");
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Course c = new Course("Java");
        Student s = new Student("Ashish");
        Professor p = new Professor("Dr. Rao");

        s.enrollCourse(c);
        p.assignCourse(c);
    }
}
