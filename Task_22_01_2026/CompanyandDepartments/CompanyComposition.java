package Task_22_01_2026.CompanyandDepartments;

import java.util.*;

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void display() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.display();
        }
    }
}

class Department {
    private String deptName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
        employees.add(new Employee("Employee1"));
    }

    public void display() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println("Employee: " + e.getName());
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("Capgemini");
        company.addDepartment("IT");
        company.addDepartment("HR");
        company.display();
    }
}
