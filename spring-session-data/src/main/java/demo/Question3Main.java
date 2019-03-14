package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class Question3Main {

    @Autowired
    Question3 question3;

    public Question3 getQuestion3() {
        return question3;
    }

    public static void main(String[] args) throws SQLException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Question3Main main = applicationContext.getBean(Question3Main.class);
        main.getQuestion3().printUserDetails();
    }
}
