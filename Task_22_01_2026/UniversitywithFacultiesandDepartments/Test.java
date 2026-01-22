package Task_22_01_2026.UniversitywithFacultiesandDepartments;


import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }
}

class University {
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public void addDepartment(String name) {
        departments.add(new Department(name));
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }
}

public class Test {
    public static void main(String[] args) {
        University uni = new University();
        Faculty f1 = new Faculty("Dr. Kumar");

        uni.addDepartment("CSE");
        uni.addFaculty(f1);
    }
}
