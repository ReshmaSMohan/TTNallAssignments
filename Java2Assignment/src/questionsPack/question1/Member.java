package questionsPack.question1;

import java.util.ArrayList;
import java.util.Date;

public class Member extends Employee{
    static String position = "member";
    private ArrayList<BookIssueDetails> issuedBooks;

    public Member(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String employeeId, Date dateOfjoining, Date dob) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, employeeId, dateOfjoining, dob, Member.position);
    }

    public void printIssuedBooks(){
        if(!issuedBooks.isEmpty())
        {
            for(int i=0;i<issuedBooks.size();i++)
            {
                issuedBooks.get(i).printDeatails();
            }
        }
    }
}
