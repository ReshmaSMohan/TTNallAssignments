package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Question7Main {

    @Autowired
    Question7 question7;

    public Question7 getQuestion7() {
        return question7;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
        User user = new User();
        user.setName("Anushka");
        user.setUsername("AnuTCS");
        user.setPassword("pwd4");
        user.setAge(24);
        user.setDob(new Date());
        applicationContext.getBean(Question7Main.class).getQuestion7().insertUser(user);
    }
}