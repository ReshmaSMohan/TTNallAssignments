package questionsPack.question10;

import java.util.Date;
import java.util.PriorityQueue;
import java.util.Queue;

public class Order {
    String orderId;
    String orderDesc;
    float price;
    String date;

    public Order() {
    }

    static Queue<String> newOrderIdQueue = new PriorityQueue<>();
    static Queue<String> completedOrderIdQueue = new PriorityQueue<>();

    public Order(String orderId, String orderDesc, float price, String date) {
        this.orderId = orderId;
        this.orderDesc = orderDesc;
        this.price = price;
        this.date = date;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

}
