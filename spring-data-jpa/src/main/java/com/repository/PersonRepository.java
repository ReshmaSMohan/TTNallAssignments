package com.repository;

import com.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {


//    Question 6

    @Query("Select firstName from Person where age=:age")
    List<Object[]> findFirstnameByAge(@Param("age") Integer age);

//    Question 7

    @Query("SELECT firstName, lastName from Person where age=:age")
    List<Object[]> findFirstNameAndLastNameByAge(@Param("age") Integer age);

//    Question 8

    @Query("SELECT p FROM Person p where p.age=:age")
    List<Person> findInfoByAge(@Param("age") Integer age);


//    Question 4

    Person findByFirstName(String firstname);

    List<Person> findByLastName(String lastname);

    Person findById(Integer id);


}
