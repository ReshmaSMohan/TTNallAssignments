package com.repository;

import com.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepositoryQ10 extends CrudRepository<Person, Integer> {

    //  1  count
    Integer countAllById(Integer id);

    Integer countByLastName(String lastName);

    //  2 distinct
    List<Person> findDistinctById(Integer id);

    List<Person> findDistinctByLastName(String lastName);

    //  3  or

    List<Person> findByFirstNameOrAge(String name,Integer age);

    //  4  and

    List<Person> findByFirstNameAndAge(String name,Integer age);
    //  5  between

    List<Person> findByAgeBetween(Integer age1,Integer age2);
    //  6  LessThan

    List<Person> findByAgeLessThan(Integer age);

    //  7  GreaterThan

    List<Person> findByAgeGreaterThan(Integer age);

    //  8  Like

    List<Person> findByFirstNameLike(String name);

    //  9  Not

    List<Person> findByLastNameNot(String name);
    List<Person> findByFirstNameNotLike(String name);

    //  10  In

    List<Person> findByAgeIn(List<Integer> ageList);

    //  11  IgnoreCase

    List<Person> findByFirstNameIgnoreCase(String name);
    List<Person> findByFirstName(String name);

}
