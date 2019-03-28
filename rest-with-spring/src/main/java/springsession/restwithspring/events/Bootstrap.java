package springsession.restwithspring.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import springsession.restwithspring.entities.Student;
import springsession.restwithspring.services.StudentService;

import java.util.Arrays;
import java.util.List;

@Component
public class Bootstrap {

    @Autowired
    StudentService studentService;

    @EventListener(ContextRefreshedEvent.class)
    void setUp() {
        System.out.println("reshma");
        Student student = new Student();
        student.setName("reshma");
        student.setEmail("resh@gmail.com");

        Student student1 = new Student();
        student1.setName("pooja");
        student1.setEmail("pooja@gmail.com");

        Student student2 = new Student();
        student2.setName("mahima");
        student2.setEmail("mahi@gmail.com");

        Student student3 = new Student();
        student3.setName("anushka");
        student3.setEmail("anu@gmail.com");

        List<Student> studentList = Arrays.asList(student, student1, student2, student3);

        studentService.saveAllStudents(studentList);
    }
}
