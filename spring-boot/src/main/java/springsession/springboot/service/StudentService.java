package springsession.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import springsession.springboot.entity.Student;
import org.springframework.stereotype.Service;
import springsession.springboot.repository.StudentRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return Arrays.asList(new Student(1, "reshma"), new Student(2, "reshmi"));
    }

    /*public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        studentIterator.forEachRemaining(students::add);

        return students;
    }*/
}
