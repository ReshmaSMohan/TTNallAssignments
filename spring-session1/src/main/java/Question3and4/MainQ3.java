package Question3and4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println("Tea Restaurant : "+applicationContext.getBean("teaRestaurant"));

        System.out.println("Express Tea Restaurant : "+applicationContext.getBean("expressTeaRestaurant"));
    }
}
