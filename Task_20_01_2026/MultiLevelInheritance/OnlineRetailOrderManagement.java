package Task_19_01_2026.MultiLevelInheritance;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD101", "10-Jan-2026");
        ShippedOrder shippedOrder = new ShippedOrder("ORD102", "11-Jan-2026", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD103", "12-Jan-2026", "TRK67890", "15-Jan-2026");
        System.out.println("========== Order Details ===========");
        order.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();
        System.out.println("--------------------------------------");
    }
}

class Order{
    String orderId;
    String orderDate;
    Order(String orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    public void getOrderStatus(){
        System.out.println("Order Placed  : "+orderId);
    }
}


class ShippedOrder extends Order{
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate,String trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    public void getOrderStatus(){
        System.out.println("Order Shipped (Tracking No : " + trackingNumber + ")");
    }

}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(String orderId , String orderDate,String trackingNumber ,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    public void getOrderStatus(){
        System.out.println("Order Delivered on : " + deliveryDate);
    }
}
