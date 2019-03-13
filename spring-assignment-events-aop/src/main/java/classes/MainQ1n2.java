package classes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ1n2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        configurableApplicationContext.start();
        configurableApplicationContext.stop();
        configurableApplicationContext.close();

    }
}
