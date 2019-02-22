package questionsPack.question1;

import java.util.Date;

public abstract class Employee extends Person {

    String employeeId;
    Date dateOfjoining;
    Date dob;
    String position;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city,
                    String landmark, String district, String state, String zipCode, String employeeId, Date dateOfjoining, Date dob, String position) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode);
        this.employeeId = employeeId;
        this.dateOfjoining = dateOfjoining;
        this.dob = dob;
        this.position=position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println( employeeId+" : "+dateOfjoining+" : "+dob+" : "+position);

    }

}
