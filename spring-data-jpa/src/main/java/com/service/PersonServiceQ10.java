package com.service;

import com.repository.PersonRepositoryQ10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PersonServiceQ10 {

    @Autowired
    PersonRepositoryQ10 personRepositoryQ10;

    public void count(){
        System.out.println(personRepositoryQ10.countAllById(2));
        System.out.println(personRepositoryQ10.countByLastName("mohan"));
    }

    public void distinct(){

        System.out.println(personRepositoryQ10.findDistinctByLastName("mohan"));
        System.out.println(personRepositoryQ10.findDistinctById(3));
    }

    public void usingOr(){
        System.out.println(personRepositoryQ10.findByFirstNameOrAge("reshma",24));
        System.out.println(personRepositoryQ10.findByFirstNameOrAge("reshma",25));
        System.out.println(personRepositoryQ10.findByFirstNameOrAge("xyz",24));
    }

    public void usingAnd(){
        System.out.println(personRepositoryQ10.findByFirstNameAndAge("reshma",24));
        System.out.println(personRepositoryQ10.findByFirstNameAndAge("reshma",25));
        System.out.println(personRepositoryQ10.findByFirstNameAndAge("xyz",24));
    }

    public void usingBetween(){
        System.out.println(personRepositoryQ10.findByAgeBetween(10,24));
        System.out.println(personRepositoryQ10.findByAgeBetween(10,25));
    }

    public void usingLessThan(){
        System.out.println(personRepositoryQ10.findByAgeLessThan(25));
    }

    public void usingGreaterThan(){
        System.out.println(personRepositoryQ10.findByAgeGreaterThan(24));
    }

    public void usingLike(){
        System.out.println(personRepositoryQ10.findByFirstNameLike("resh__"));
        System.out.println(personRepositoryQ10.findByFirstNameLike("resh%"));
    }

    public void usingNot(){
        System.out.println(personRepositoryQ10.findByLastNameNot("mohan"));
        System.out.println(personRepositoryQ10.findByFirstNameNotLike("resh%"));
    }

    public void usingIn(){
        System.out.println(personRepositoryQ10.findByAgeIn(Arrays.asList(10,24)));
    }

    public void usingIgnoreCase(){
        System.out.println(personRepositoryQ10.findByFirstNameIgnoreCase("Reshma"));
        System.out.println(personRepositoryQ10.findByFirstName("ReshMa"));
    }


}
