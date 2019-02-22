package questionsPack.question1;

//Consider library management in an organization
//employees will be the members of library;

public class Q1LibraryManagementMain {
    public static void main(String[] args) {
        System.out.println("welcome to Library management system");
        Member member = new Member();
        member.requestForIssue();
        member.printIssuedBooks();
        member.returnBooks("b01");
    }
}
