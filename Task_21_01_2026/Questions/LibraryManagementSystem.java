package Task_21_01_2026.Questions;

import java.util.*;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return title + " by " + author;
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {}

    public boolean checkAvailability() {
        return true;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserveItem() {}

    public boolean checkAvailability() {
        return false;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = List.of(
                new Book(1, "Java", "James"),
                new Magazine(2, "TechToday", "Editorial"),
                new DVD(3, "Inception", "Nolan")
        );

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails() + " Loan Days: " + item.getLoanDuration());
        }
    }
}
