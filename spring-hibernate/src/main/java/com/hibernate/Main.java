package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Author author = new Author();
        author.setFirstName("reshma");
        author.setLastName("mohan");
        author.setAge(24);

        //Question3
        author.setDob(new SimpleDateFormat("YYYY-MM-DD").parse("1995-11-30"));

        //Question4
/*
        Author author1 = new Author();
        author1.setFirstName("reshmi");
        author1.setLastName("mohan");
        author1.setAge(17);
        author1.setDob(new SimpleDateFormat("YYYY-MM-DD").parse("2001-11-30"));
        Author author2 = new Author();
        author2.setFirstName("pooja");
        author2.setLastName("solanki");
        author2.setAge(24);
        author2.setDob(new SimpleDateFormat("YYYY-MM-DD").parse("1995-11-30"));
        Author author3 = new Author();
        author3.setFirstName("mahima");
        author3.setLastName("gupta");
        author3.setAge(23);
        author3.setDob(new SimpleDateFormat("YYYY-MM-DD").parse("1997-11-30"));
        Author author4 = new Author();
        author4.setFirstName("Anushka");
        author4.setLastName("mittal");
        author4.setAge(23);
        author4.setDob(new SimpleDateFormat("YYYY-MM-DD").parse("1997-10-03"));
*/


//        Question 11

/*
        Address address = new Address();
        address.setStreetNumber("c-503");
        address.setLocation("ghaziabad");
        address.setState("uttar pradesh");
        author.setAddress(address);
        author1.setAddress(address);
        author4.setAddress(address);
        Address address1 = new Address();
        address1.setStreetNumber("AL-13");
        address1.setLocation("new delhi");
        address1.setState("delhi");
        author2.setAddress(address1);
        author3.setAddress(address1);
*/

//        Question 3
/*
        List<String> subjectList = Arrays.asList("Java", ".NET", "C");
        author.setSubjectsList(subjectList);
        author1.setSubjectsList(subjectList);
        List<String> subjectList1 = Arrays.asList("Physics", "Quantum", "Electronics");
        author2.setSubjectsList(subjectList1);
        author3.setSubjectsList(subjectList);
        List<String> subjectList2 = Arrays.asList("C#", ".NET", "Javascript");
        author4.setSubjectsList(subjectList2);
*/

//        Question 15
       /* Book book = new Book();
        book.setBookName("Book");
        author.setBook(book);
        Book book2 = new Book();
        book2.setBookName("Book2");
        author1.setBook(book2);
        author2.setBook(book2);
        Book book3 = new Book();
        book3.setBookName("Book3");
        author3.setBook(book3);
        author4.setBook(book3);*/

       // Question 16 (unidirectional)
        Book book = new Book();
        book.setBookName("Book");
        Book book2 = new Book();
        book2.setBookName("Book2");
        Book book3 = new Book();
        book3.setBookName("Book3");

        author.setBooks(Arrays.asList(book,book2,book3));

        // Question 16 (Bidirectional)
        book.setAuthor(author);
        book2.setAuthor(author);
        book3.setAuthor(author);

        // Question 16(without additional table)
 //       author.setBooks(Arrays.asList(book,book2,book3));

        // Question 17
 /*       author1.getBooks().add(book);
        book.setPersonList(Arrays.asList(author,author1));*/

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //        Question 15
        /*session.save(book);
        session.save(book2);
        session.save(book3);*/

        // Question 16
/*        session.save(book);
        session.save(book2);
        session.save(book3);*/

        session.persist(author);


/*        session.save(author1);
        session.save(author2);
        session.save(author3);
        session.save(author4);
*/

//        Author readAuthor = session.get(Author.class, "reshma");

//        Author updateAuthor = session.get(Author.class,"reshma");
//        updateAuthor.setLastName("sreekala");
//        session.update(updateAuthor);

//        Author deleteAuthor = session.get(Author.class, "reshma");
//        session.delete(deleteAuthor);

        session.getTransaction().commit();
//        System.out.println(readAuthor);
    }
}
