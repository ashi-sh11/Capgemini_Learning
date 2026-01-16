package Task_16_01_26.Level1;


class Libary{
    private String title;
    private String author;
    private int price;
    private boolean isAvailability;

    Libary(String title , String author ,int price){
        this.title=title;
        this.author=author;
        this.price=price;
        this.isAvailability=true;
    }

    Libary(Libary copyBook){
        this.title=copyBook.title;
        this.author=copyBook.author;
        this.price=copyBook.price;
        this.isAvailability=copyBook.isAvailability;
    }

    public void borrowBook(){
        if(isAvailability){
            System.out.println("Book is Availability, Book borrowed successfully");
            isAvailability=false;
        }
        else {
            System.out.println("Sorry, this book is currently not available");
        }
    }

}