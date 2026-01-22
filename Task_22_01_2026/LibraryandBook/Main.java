package Task_22_01_2026.LibraryandBook;

public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("Java", "James");
        Book secondBook = new Book("C++", "John");
        Library firstLibrary = new Library("CG LAB");
        firstLibrary.addBooks(firstBook);
        firstLibrary.addBooks(secondBook);
        firstLibrary.showTotalBooks();

    }
}
