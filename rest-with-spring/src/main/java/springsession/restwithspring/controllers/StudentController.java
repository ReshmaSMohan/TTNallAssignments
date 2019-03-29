package springsession.restwithspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;
import springsession.restwithspring.entities.Student;
import springsession.restwithspring.exceptions.StudentNotFoundException;
import springsession.restwithspring.services.StudentService;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    MessageSource messageSource;

    @GetMapping("/")
  String helloWorld(){
        System.out.println("hello world");
        System.out.println(LocaleContextHolder.getLocale());
        return messageSource.getMessage("good.morning.message",null,LocaleContextHolder.getLocale());
    }

    @GetMapping("/students")
    List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    Student getStudentById(@PathVariable Integer id) throws StudentNotFoundException {

        Student student = studentService.getStudentById(id);

        //Question 2

        if (student == null) {
            throw new StudentNotFoundException("Student not found");
        }
        return student;
    }

    @PostMapping(value = "/students",produces = "application/xml")
    Student saveStudent(@Valid @RequestBody Student student) {
        studentService.saveStudent(student);
        return studentService.getStudentById(student.getId());
    }
}
