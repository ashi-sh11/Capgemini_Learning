package Task_28_01_2026.Doubly_LinkedList.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addAtEnd(101, "Java Basics", "James Gosling", "Programming", true);
        lib.addAtBeginning(102, "DSA", "Mark Allen", "Computer Science", true);
        lib.addAtEnd(103, "Clean Code", "Robert Martin", "Software", false);

        System.out.println("All Books (Forward):");
        lib.displayForward();

        System.out.println("\nAll Books (Reverse):");
        lib.displayReverse();

        lib.searchByTitle("DSA");

        lib.updateAvailability(103, true);

        lib.removeById(102);

        lib.countBooks();
    }
}
