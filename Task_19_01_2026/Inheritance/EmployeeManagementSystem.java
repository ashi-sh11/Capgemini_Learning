package Task_19_01_2026.Inheritance;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee emp1 = new Manager("Ashish", 101, 80000, 10);
        Employee emp2 = new Developer("Rahul", 102, 60000, "Java");
        Employee emp3 = new Intern("Neha", 103, 20000, 6);

        System.out.println("=== Employee Details ===");

        emp1.displayDetails();
        System.out.println("--------------------");

        emp2.displayDetails();
        System.out.println("--------------------");

        emp3.displayDetails();
    }
}

class Employee{
    public String name;
    public int id;
    public int salary;

    public void displayDetails(){
        System.out.println("Name    : "+name);
        System.out.println("Id      : "+id);
        System.out.println("Salary  : "+salary);
    }
    Employee(String name ,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
}

class Manager extends Employee{
    public int teamSize ;

    public Manager(String name , int id , int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size :"+teamSize);
    }
}

class Developer extends Employee{
    public String programmingLanguage ;

    public Developer(String name , int id , int salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }
}

class Intern extends Employee{
    public int  dateOfjoin ;
    public Intern(String name , int id , int salary,int dateOfjoin){
        super(name,id,salary);
        this.dateOfjoin=dateOfjoin;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Date of joining : "+dateOfjoin);
    }
}

