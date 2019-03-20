package com.hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    private String bookName;

    //Question 16 (Bidirectional)
    @ManyToOne
    Author author;

     public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    //Question 17
    /*@ManyToMany(mappedBy = "books")
    List<Author> personList = new ArrayList<Author>();

    public List<Author> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Author> personList) {
        this.personList = personList;
    }
*/
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
