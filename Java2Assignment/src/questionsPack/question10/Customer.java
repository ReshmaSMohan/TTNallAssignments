package questionsPack.question10;

public class Customer extends Actor {

    String customerNo;

    public Customer() {
    }

    public Customer(String customerNo, String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city,
                    String landmark, String district, String state, String zipCode) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode);
        this.customerNo = customerNo;
    }

    Cashier cashier;
    public String order() {
        return cashier.payAndgetToken();
    }

    public void collectCoffee(String token)
    {
        String notification="";
        if(notification.equals(token));
        System.out.println("collect and enjoy");
    }

}
