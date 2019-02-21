package questionsPack.question10;

import java.util.Date;

public class Cashier extends Employee {

    static String position = "cashier";

    public Cashier(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String employeeId, Date dateOfjoining, Date dob) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, employeeId, dateOfjoining, dob, Cashier.position);
    }


    public String payAndgetToken(){

        String orderId="";
        String orderDesc="";
        float price=00.00f;
        String date="";
        boolean pay=true;
        Order order = new Order(orderId,orderDesc,price,date);

        if(pay)
        {
            addTonewOrderIdQueue(orderId);
            return order.getOrderId();

        }

        return "";
    }

    private void addTonewOrderIdQueue(String orderID) {
        Order.newOrderIdQueue.add(orderID);
    }

}
