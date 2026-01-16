package Task_16_01_26.Level1;

public class Book {
    private String title;
    private String author;
    private int price;

    Book(){
        this.title ="java programming";
        this.author ="james";
        this.price=499;
    }
    Book(String title,String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void displayDetails(){
        System.out.println("Title  : \t"+title);
        System.out.println("Author : \t"+author);
        System.out.println("Price  : \t"+price);
    }
}
