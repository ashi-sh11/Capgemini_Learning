package Task_18_01_2026.Questions;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee first = new Employee("Ashish" ,101,"HR");
        Employee second = new Employee("Aman" ,102,"Intern");
        Employee.displayTotalEmployees();
        System.out.println("\n-------------------");
        Employee.displayIfVaildEmployee(first);
        System.out.println("-------------------");
        Employee.displayIfVaildEmployee(second);

    }
}

class Employee{
    private static String companyName ="Capgemini pvt";
    private static int totalEmployee ;
    private String name;
    private final int id ;
    private String designation;

    Employee(String name , int id, String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployee++;
    }
    static void displayTotalEmployees(){
        System.out.println("Total number of employee is : "+totalEmployee);
    }
    void displayEmployeeDetails(){
        System.out.println("Name         : "+name);
        System.out.println("Id           : "+id);
        System.out.println("Designation  : "+designation);
    }

    static void displayIfVaildEmployee(Employee obj){
        if(obj instanceof Employee){
            Employee first = (Employee) obj;
            first.displayEmployeeDetails();
        }
        else
            System.out.println("Invalid object. Not a Employee.");
    }
}