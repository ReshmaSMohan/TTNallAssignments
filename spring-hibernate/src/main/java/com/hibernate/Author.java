package com.hibernate;

import javax.persistence.*;
import java.util.*;


@Entity
public class Author {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @Column(name = "author_firstname")
    private String firstName;
    @Transient//@Column(name = "author_lastname")
    private String lastName;
    @Column(name = "author_age")
    private Integer age;

    @Column(name = "author_dob")
    @Temporal(TemporalType.DATE)
    private Date dob;

    //  Question 11
    @Embedded
    Address address;

    //  Question 12
    @ElementCollection
    List<String> subjectsList = new ArrayList<>();

    //    Question 15
/*    @OneToOne
    @JoinColumn(name = "author_book")
    private Book book;
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/

    //  Question 16
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(joinColumns = @JoinColumn(name="author_id")
            ,inverseJoinColumns = @JoinColumn(name = "book_id"))
     Collection<Book> books= new ArrayList<Book>();
/*    //without extra table
    @OneToMany(mappedBy = "author",cascade = CascadeType.PERSIST)
    Collection<Book> books = new ArrayList<Book>();*/

   // Question 17
/*
   @ManyToMany
   Collection<Book> books = new ArrayList<>();
*/

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public List<String> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<String> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                ", subjectsList=" + subjectsList +
                '}';
    }
}
