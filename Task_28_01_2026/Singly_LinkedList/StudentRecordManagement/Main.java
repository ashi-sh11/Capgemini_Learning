package Task_28_01_2026.Singly_LinkedList.StudentRecordManagement;

public class Main {
    public static void main(String[] args) {
                StudentLinkedList list = new StudentLinkedList();
                list.addAtBeginning("Ashish", 1,20, 'A');
                list.addAtEnd( "Ravi",2, 21, 'B');
                list.addAtPosition(2, "Neha", 3,19, 'A');
                list.displayStudents();
                list.searchByRollNo(2);
                list.updateGrade(2, 'A');
                list.deleteByRollNo(1);
                System.out.println("After deletion:");
                list.displayStudents();

    }
}
