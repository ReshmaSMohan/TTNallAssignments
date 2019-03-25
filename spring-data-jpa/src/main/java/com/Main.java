package com;

import com.config.PersistenceContext;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(PersistenceContext.class);

        PersonService personService = applicationContext.getBean(PersonService.class);

//        Question 3

        personService.insertPerson();

        personService.insertPersons();

        personService.findOne(4);

        personService.findAll();

        personService.findAllUsingIds();

        personService.count();

        personService.deleteById(2);

        personService.deleteAll();
    }
}
