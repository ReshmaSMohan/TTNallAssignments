package Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ6 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println("Autowired by name : "+applicationContext.getBean("expressTeaRestaurantQ6"));

        System.out.println("Autowire by type : "+applicationContext.getBean("teaRestaurantQ6"));

        System.out.println("Autowired by constructor : "+applicationContext.getBean("teaRestaurantQ6ByConst"));
    }
}
