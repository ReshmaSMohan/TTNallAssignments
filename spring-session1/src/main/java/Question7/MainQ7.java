package Question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ7 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant restaurant1 = (Restaurant) applicationContext.getBean("res1Q8");
        Restaurant restaurant2 = (Restaurant) applicationContext.getBean("res2Q8");

        System.out.println(restaurant1.getHotDrink());
        System.out.println(restaurant2.getHotDrink());
    }
}
