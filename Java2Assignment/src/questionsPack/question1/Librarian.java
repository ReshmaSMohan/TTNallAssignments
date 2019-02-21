package questionsPack.question1;

import java.util.Date;

public class Librarian extends Employee {

    static String position = "Librarian";

    public Librarian(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String employeeId, Date dateOfjoining, Date dob) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, employeeId, dateOfjoining, dob, Librarian.position);
    }

}
