package Task_15_01_26.Level1;

public class TrackInventory {
    public static void main(String[] args) {

    }
}
class Item{
    private int itemCode;
    private String itemName;
    private int price ;

    Item(int itemCode,String itemName,int price){
        this.itemCode=itemCode;
        this.itemName =itemName;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Item code :"+itemCode+"\tItem Name :"+itemName+"\tItem Price :"+price);
    }
}
