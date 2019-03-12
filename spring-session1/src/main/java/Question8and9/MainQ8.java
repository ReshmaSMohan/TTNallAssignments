package Question8and9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ8 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        Restaurant restaurant = applicationContext.getBean("restaurant",Restaurant.class);
        System.out.println(restaurant);

//        System.out.println(applicationContext.getBean("restaurantQ9"));
    }
}
