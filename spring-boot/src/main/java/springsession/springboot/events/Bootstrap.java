package springsession.springboot.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import springsession.springboot.entity.Student;
import springsession.springboot.repository.StudentRepository;

import java.util.Iterator;

@Component
public class Bootstrap {

/*    @EventListener(ApplicationStartedEvent.class)
    public void init(){
        System.out.println("Your Application is up and running");
    }*/

    @Autowired
    StudentRepository studentRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        if (!studentIterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i,"student"+i);
                studentRepository.save(student);
                System.out.println("Book " + i + " created");
            }
        }
        System.out.println("Your Application is up and running");
    }
}