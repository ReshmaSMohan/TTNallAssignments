package classes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ3 {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        DatabaseQ3 databaseQ3 = configurableApplicationContext.getBean("databaseQ3",DatabaseQ3.class);
        databaseQ3.connect();
    }
}