package questionsPack.question1;

public class Supplier extends Person {
    String supplierId;

    public Supplier(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String supplierId) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode);
        this.supplierId = supplierId;
    }

    public void supplyBooks(){
        //make new object of books type and add it
    }

}
