package Task_22_01_2026.LibraryandBook;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    ArrayList<Book> someBooks;

    public Library(String libraryName){
        this.libraryName=libraryName;
        someBooks = new ArrayList<Book>();

    }
    public void addBooks(Book book){
        someBooks.add(book);
    }

    public String getLibraryName() {
        return libraryName;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void showTotalBooks(){
        System.out.println("Library name "+getLibraryName());

        for (Book ele :someBooks){
            System.out.println("Title : "+ele.getTitle()+", Author "+ele.getAuthor());
        }
    }
}
