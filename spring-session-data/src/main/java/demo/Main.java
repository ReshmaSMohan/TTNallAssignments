package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");

        UserDAO userDAO = applicationContext.getBean(UserDAO.class);

        //Question8
        System.out.println("-------------map--------------");
        userDAO.queryForMap();

        //Question9
        System.out.println("-------------list--------------");
        userDAO.queryForList();

        //Question10
        System.out.println("-------------RowMappper--------------");
        System.out.println(userDAO.getUser("poojanagarro"));

        //Question11
        System.out.println("-------------Hibernate--------------");
        userDAO.sessionFactoryDemo();

    }
}
