package springsession.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springsession.springboot.entity.Student;
import springsession.springboot.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping("/")
    public String index(){
        logger.info("INFO: default page");
        return "Hello World";
    }

    @GetMapping("/getstudents")
    public List<Student> getStudents(){
        logger.info("INFO: get students");
        return studentService.getStudents();
    }

}
