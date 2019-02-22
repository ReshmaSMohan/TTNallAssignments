package questionsPack.question1;

import java.util.function.Supplier;

public abstract class Books extends Person {
    private String bookID;
    private String title;
    private String author;
    private boolean isIssued;
    private String publisher;
    private Supplier supplier;
    private BookIssueDetails bookIssueDetails;

    public Books(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String bookID, String title, String author, boolean isIssued, String publisher, Supplier supplier) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode);
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
        this.publisher = publisher;
        this.supplier = supplier;
    }

    public String getBookID() {
        return bookID;
    }
}

class TechBook extends Books {
    private String type = "technical";

    public TechBook(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String bookID, String title, String author, boolean isIssued, String publisher, Supplier supplier, String type) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, bookID, title, author, isIssued, publisher, supplier);
        this.type = type;
    }
}

class FictionBooks extends Books {
    private String type = "fictional";

    public FictionBooks(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String bookID, String title, String author, boolean isIssued, String publisher, Supplier supplier, String type) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, bookID, title, author, isIssued, publisher, supplier);
        this.type = type;
    }
}

class SciFiBooks extends Books {
    private String type = "science-fictional";

    public SciFiBooks(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String bookID, String title, String author, boolean isIssued, String publisher, Supplier supplier, String type) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, bookID, title, author, isIssued, publisher, supplier);
        this.type = type;
    }
}

class MiscBooks extends Books {
    public MiscBooks(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city, String landmark, String district, String state, String zipCode, String bookID, String title, String author, boolean isIssued, String publisher, Supplier supplier, String type) {
        super(firstName, lastName, phoneNumber, emailId, houseno, city, landmark, district, state, zipCode, bookID, title, author, isIssued, publisher, supplier);
        this.type = type;
    }

    private String type = "miscellaneous";
}
