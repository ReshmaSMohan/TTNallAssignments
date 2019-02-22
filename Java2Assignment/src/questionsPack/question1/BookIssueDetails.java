package questionsPack.question1;

import java.util.ArrayList;

public class BookIssueDetails {

    private Member member;
    private Books book;
    public void issueBook(String employeeId){
        //member.getEmployeeId()==employeeId; then -

        ArrayList<String> issuedBooks = member.getIssuedBooks();
        if(issuedBooks.size()<10) {
            System.out.println("Allow Book issue");
            member.setIssuedBooks(book.getBookID());
        }
        else
            System.out.println("reached limit");

    }

    public void printDetails(){
        member.printIssuedBooks();//we will get the specific employee's issued books;
    }
}
