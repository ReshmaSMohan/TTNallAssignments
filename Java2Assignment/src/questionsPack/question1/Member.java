package questionsPack.question1;

import java.util.ArrayList;
import java.util.Date;

public class Member extends Employee{
    static String position = "member";
    private ArrayList<String> issuedBooks;
    private Books book;
    private BookIssueDetails bookIssueDetails;

    public Member() {
    }

    public Member(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String employeeId, Date dateOfjoining, Date dob) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, employeeId, dateOfjoining, dob, Member.position);
    }

    public ArrayList<String> getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(String bookId) {
        this.issuedBooks.add(bookId);
    }


    public void printIssuedBooks(){
        if(!issuedBooks.isEmpty())
        {
            for(int i=0;i<issuedBooks.size();i++)
            {
                bookIssueDetails.printDetails();
            }
        }
    }

    public Member(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String employeeId, Date dateOfjoining, Date dob, String position) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, employeeId, dateOfjoining, dob, position);
    }

    public void requestForIssue(){
        bookIssueDetails.issueBook(employeeId);
    }
    public void returnBooks(String bookId){
        issuedBooks.remove(bookId);
    }

}
