package Task_15_01_26.Level1;

public class BooksDetails {
    public static void main(String[] args) {
        books first =new  books("haikui" ,"Manga" ,134);
        first.displayBooksDetails();
    }
}

class books{
    private String title;
    private String author;
    private int price;

    books(String title, String author,int price){
        this.title=title;
        this.author = author;
        this.price = price;
    }

    public void displayBooksDetails(){
        System.out.print("title :"+title+"\t Author :"+ author+"\t Price :"+price);
    }
}