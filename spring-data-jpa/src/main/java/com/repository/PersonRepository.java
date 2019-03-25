package com.repository;

import com.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer> {

//    Question 4

    Person findByFirstName(String firstname);

    List<Person> findByLastName(String lastname);

    Person findById(Integer id);
}
