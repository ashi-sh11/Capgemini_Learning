package Task_28_01_2026.Singly_LinkedList.StudentRecordManagement;

public class StudentLinkedList {
    private Student head ;

    public void addAtBeginning(String name,int rollNumber ,int age,char grade){
        Student newStudent= new Student(name,rollNumber,age,grade);
        newStudent.next=head;
        head =newStudent;
    }

    public void addAtEnd( String name,int rollNumber, int age, char grade) {
        Student newStudent= new Student(name,rollNumber,age,grade);

        if(head == null) {
            head=newStudent;
            return;
        }

        Student temp =head;
        while (temp.next!=null){
            temp=temp.next;
        }

        temp.next=newStudent;
    }

    public void addAtPosition(int postion ,String name,int rollNumber, int age, char grade) {
        if(postion<=0){
            System.out.println("Invalid position");
            return;
        }
        if (postion==1){
            addAtBeginning(name,rollNumber,age,grade);
            return;
        }

        Student newStudent= new Student(name,rollNumber,age,grade);

        Student temp = head;
        for (int i = 1; i < postion-1 && temp!=null; i++) {
            temp.next=temp;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newStudent.next=temp.next;
        temp.next=newStudent;
    }
    public void deleteByRollNo(int rollNo) {
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.getRollNumber()==rollNo){
            head=head.next;
            System.out.println("Student is Deleted");
            return;
        }

        Student temp = head;
        while (temp.next !=null && temp.getRollNumber()==rollNo){
            temp.next=temp;
        }
        if(temp.next==null){
            System.out.println("Student not found");
        }
        else{
            temp.next = temp.next.next ;
            System.out.println("Student deleted");
        }
    }

    public void searchByRollNo(int rollNo) {
        Student temp = head;

        while (temp != null) {
            if (temp.getRollNumber() == rollNo) {
                System.out.println("Student Found:");
                System.out.println(temp.getRollNumber() + " " + temp.getName() + " " + temp.getRollNumber() + " " + temp.getGrade());
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    public void updateGrade(int rollNo, char newGrade) {
        Student temp = head;
        while (temp!=null){
            if(temp.getRollNumber() == rollNo){
                temp.setGrade(newGrade);
                System.out.println("Grade updated");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found");
    }


    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records");
            return;
        }

        Student temp = head;
        while (temp != null) {
            System.out.println(
                    temp.getRollNumber() + " | " +
                            temp.getName() + " | " +
                            temp.getAge() + " | " +
                            temp.getGrade()
            );
            temp = temp.next;
        }
    }
}
