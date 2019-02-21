package questionsPack.question10;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;

public class Barista extends Employee {

    static String position = "barista";

    public Barista(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String employeeId, Date dateOfjoining, Date dob) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, employeeId, dateOfjoining, dob, Barista.position);
    }


    public void prepareOrder(){
       String orderID = Order.newOrderIdQueue.remove();

       Order order=new Order();//

       if(order.getOrderId()==orderID)
        order.getOrderDesc();
       boolean prepare = true;
       if(prepare) {
           notificationImitation(orderID);
           addToCompleteQueue(orderID);
       }
    }

    public void notificationImitation(String orderID)
    {
        System.out.println("imitation screen notified : "+orderID);;
    }

    private void addToCompleteQueue(String orderID) {
        Order.completedOrderIdQueue.add(orderID);
    }

}