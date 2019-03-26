package com;

import com.config.PersistenceContext;
import com.service.PersonServiceQ10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainQ10 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(PersistenceContext.class);

        PersonServiceQ10 personService = applicationContext.getBean(PersonServiceQ10.class);

//        personService.count();
//       personService.distinct();
//        personService.usingOr();
//        personService.usingAnd();
//        personService.usingBetween();
//        personService.usingLessThan();
//         personService.usingGreaterThan();
//        personService.usingLike();
//        personService.usingNot();
//        personService.usingIn();
        personService.usingIgnoreCase();
    }
}
