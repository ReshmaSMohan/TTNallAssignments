package com.service;

import com.entity.Person;
import com.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Component
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void insertPerson() {
        Person person = new Person();
        person.setFirstName("reshma");
        person.setLastName("mohan");
        person.setSalary(15000f);
        person.setAge(24);
        personRepository.save(person);
    }

    public void insertPersons() {
        Person person = new Person();
        person.setFirstName("reshmi");
        person.setLastName("mohan");
        person.setAge(25);
        person.setSalary(5000f);

        Person person1 = new Person();
        person1.setFirstName("pooja");
        person1.setLastName("s");
        person1.setAge(25);
        person1.setSalary(25000f);

        List<Person> personList = Arrays.asList(person, person1);

        personRepository.save(personList);

//        personRepository.delete(person);
//        personRepository.delete(personList);

    }

    public void findOne(Integer id) {
        if (personRepository.exists(id)) {
            Person person = personRepository.findOne(id);
            System.out.println(person);
        } else
            System.out.println("Id not exists");
    }

    public void findAll() {
        Iterable<Person> personListIterable = personRepository.findAll();
        System.out.println("Find all -- " + personListIterable);
    }

    public void findAllUsingIds() {
        List ids = Arrays.asList(1, 2);
        Iterable<Person> personListIterable = personRepository.findAll(ids);
        System.out.println("Using ids -- " + personListIterable);
    }

    public void count() {
        System.out.println("Count -- " + personRepository.count());
    }

    public void deleteById(Integer id) {
        personRepository.delete(id);
        System.out.println("----------After deletion----------");
        Iterable<Person> personListIterable = personRepository.findAll();
        System.out.println(personListIterable);
    }

    public void deleteAll() {
        personRepository.deleteAll();
        System.out.println("----------After delete all----------");
        Iterable<Person> personListIterable = personRepository.findAll();
        System.out.println(personListIterable);
    }

//    Question 5

    public void findByFirstName(String name) {
        System.out.println("----find by firstname----");
        System.out.println(personRepository.findByFirstName(name));
    }

    public void findByLastName(String name) {
        System.out.println("----find by lastname----");
        System.out.println(personRepository.findByLastName(name));
    }

    public void findById(Integer id) {
        System.out.println("----find by id----");
        System.out.println(personRepository.findById(id));
    }

    //    Question 6
    public void findFirstnameByAge(Integer age) {
        List<Object[]> firstnames = personRepository.findFirstnameByAge(age);
        Iterator firstname = firstnames.iterator();
        while (firstname.hasNext())
            System.out.println(firstname.next());
    }

    //    Question 7
    public void findFirstnameAndLastNameByAge(Integer age) {
        List<Object[]> names = personRepository.findFirstNameAndLastNameByAge(age);
        Iterator<Object[]> name = names.iterator();
        while (name.hasNext()) {
            Object[] object = name.next();
            System.out.println(object[0] + " : " + object[1]);
        }
    }

    //        Question 8
    public void findInfoByAge(Integer age) {
        List<Person> personList = personRepository.findInfoByAge(age);
        System.out.println(personList);
    }

    //        Question 9
    public void findCountByName(){
        System.out.println(personRepository.findCountByName());
    }

    //        Question 11
    public void findByAgeGreaterThanAndSort(){
        System.out.println(personRepository.findByAgeGreaterThanOrderByIdDesc(20));
    }

}



