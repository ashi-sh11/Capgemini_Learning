package Task_28_01_2026.Singly_LinkedList.StudentRecordManagement;

public class Student {
    private String name ;
    private  int rollNumber;
    private int age ;
    private char grade;
    Student next;
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public int getAge() {
        return age;
    }
    public char getGrade() {
        return grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    Student(String name , int rollNumber,int age, char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.age=age;
        this.grade=grade;
        this.next =null;
    }
}
