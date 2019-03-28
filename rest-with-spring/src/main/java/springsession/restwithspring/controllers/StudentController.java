package springsession.restwithspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springsession.restwithspring.entities.Student;
import springsession.restwithspring.services.StudentService;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    Student getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    Student saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return studentService.getStudentById(student.getId());
    }
}
