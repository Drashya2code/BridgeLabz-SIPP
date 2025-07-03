package inheritanceproblem;

import java.util.Date;

class Order{
    int orderId;
    Date orderDate;

    public Order(int  orderId, Date orderDate){
        this.orderDate = orderDate;
        this.orderId = orderId;
    }
    public int getOrderId(){
        return orderId;
    }

    public Date getOrderDate(){
        return orderDate;
    }

    public String getOrderStatus(){
        return "order Places";
    }
}


class ShippedOrder extends Order{
    int trackingNumber;
    public ShippedOrder (int orderId, Date orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public int getTrackingNumber(){
        return trackingNumber;
    }

    @Override
    public String getOrderStatus(){
        return " Order Shipped " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder{
    Date deliveryDate;

    public DeliveredOrder(int orderId, Date orderDate, int trackingNumber, Date deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate(){
        return deliveryDate;
    }

    @Override
    public String getOrderStatus(){
        System.out.println("Your Order of orderId " + orderId + " which placed on " + orderDate);
        System.out.println("Shipped with tracking Number "+ trackingNumber);
        System.out.println("Deliver on " + deliveryDate);
        return  deliveryDate.toString();
    }
}

public class onlineRetailOrder{
    public static void main(String[] args) {
        Order order = new Order(101, new Date());
        ShippedOrder shippedOrder = new ShippedOrder(102, new Date() , 987);
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, new Date(), 9876, new Date());

        System.out.println(order.getOrderStatus()); 
        System.out.println(shippedOrder.getOrderStatus());
        deliveredOrder.getOrderStatus();

    }
    
}