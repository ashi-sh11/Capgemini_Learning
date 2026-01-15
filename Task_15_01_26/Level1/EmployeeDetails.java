package Task_15_01_26.Level1;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Ashish",2201,43000);
        firstEmployee.display();
    }
}

class Employee{
    private String name ;
    private int employeeId;
    private int salary;

    Employee(String name , int employeeId ,int salary){
        this.name = name;
        this.employeeId =employeeId;
        this.salary=salary;
    }

    void display(){
        System.out.println("Name of the Employee "+name);
        System.out.println("Employee ID of the Employee "+employeeId);
        System.out.println("Salary of the Employee "+salary);

    }
}