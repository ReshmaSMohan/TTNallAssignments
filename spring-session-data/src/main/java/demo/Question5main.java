package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Question5main {

    @Autowired
    Question5 question5;

    public Question5 getQuestion5() {
        return question5;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        applicationContext.getBean(Question5main.class).getQuestion5().userCount();
    }
}
