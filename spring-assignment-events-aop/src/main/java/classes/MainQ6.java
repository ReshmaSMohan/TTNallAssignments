package classes;

import aspect.LoggingAspect;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainQ6 {
    public static void main(String[] args){
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Q6IOException q6IOException = configurableApplicationContext.getBean(Q6IOException.class);
        try {
           // q6IOException.methodCreateFile();
            q6IOException.methodDeleteFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
