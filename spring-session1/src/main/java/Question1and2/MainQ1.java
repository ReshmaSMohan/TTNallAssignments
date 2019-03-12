package Question1and2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ1 {
    public static void main(String[] args) {

        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(applicationContext.getBean("database"));

    }
}
