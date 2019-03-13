package classes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ4n5 {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        DatabaseQ4n5 database = configurableApplicationContext.getBean(DatabaseQ4n5.class);

        database.connect();
        System.out.println("---------------------------------");
        database.disconnect();

    }
}
