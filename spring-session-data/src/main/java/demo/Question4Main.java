package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class Question4Main {

    @Autowired
    Question4 question4;

    public Question4 getQuestion4() {
        return question4;
    }

    public static void main(String[] args) throws SQLException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Question4Main main = applicationContext.getBean(Question4Main.class);
        main.getQuestion4().printUserDetails();
    }
}