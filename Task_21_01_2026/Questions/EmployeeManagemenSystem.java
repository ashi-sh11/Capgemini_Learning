package Task_21_01_2026.Questions;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagemenSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new FullTimeEmployee(101, "Ashish", 50000);
        emp1.assignDepartment("IT");
        Employee emp2 = new PartTimeEmployee(102, "Ravi", 80, 500);
        emp2.assignDepartment("Support");
        employees.add(emp1);
        employees.add(emp2);
        System.out.println("=== Employee Details ===");
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("-----------------------");
        }
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

abstract class Employee implements Department {

    private int employeeId;
    private String name;
    protected double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : INR " + calculateSalary());
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // Fixed salary
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name,
                            int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
