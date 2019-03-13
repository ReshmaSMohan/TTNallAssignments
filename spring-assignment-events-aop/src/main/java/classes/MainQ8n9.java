package classes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ8n9 {
    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        //Question 8
        DatabaseQ7 database = configurableApplicationContext.getBean("database",DatabaseQ7.class);
        database.connect();
        database.disconnect();
        System.out.println("------------------------");

        //Question 9
        database = configurableApplicationContext.getBean("database1", DatabaseQ7.class);
        database.agrMethod(20,30);

    }
}
