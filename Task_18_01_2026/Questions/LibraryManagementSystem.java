package Task_18_01_2026.Questions;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book.displayLibraryName();
        System.out.println("-------------------");
        Book book1 = new Book("Code", "Robert C. Martin", "ISBN101");
        Book book2 = new Book("Effective Java", "Joshua Bloch", "ISBN102");

        Book.displayIfValidBook(book1);
        System.out.println("-------------------");
        Book.displayIfValidBook(book2);
    }
}

class Book{


    private static String libraryName = "Central City Library";
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name : " + libraryName);
    }
    public void displayBookDetails() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("ISBN         : " + isbn);
    }
    public static void displayIfValidBook(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            book.displayBookDetails();
        } else {
            System.out.println("Invalid object. Not a Book.");
        }
    }
}