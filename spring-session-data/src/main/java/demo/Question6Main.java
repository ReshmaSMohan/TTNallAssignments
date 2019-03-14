package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Question6Main {

    @Autowired
    Question6 question6;

    public Question6 getQuestion6() {
        return question6;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(applicationContext.getBean(Question6Main.class).getQuestion6().getUserName());
    }
}
