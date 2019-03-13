package classes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ7 {
    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        DatabaseQ7 database = configurableApplicationContext.getBean("database", DatabaseQ7.class);

        database.connect();
        System.out.println("---------------------------------");
        database.disconnect();

        //bean
        database = configurableApplicationContext.getBean("database1", DatabaseQ7.class);
        database.connect();

        //arg
        database.agrIntegerMethod(10);
    }
}
