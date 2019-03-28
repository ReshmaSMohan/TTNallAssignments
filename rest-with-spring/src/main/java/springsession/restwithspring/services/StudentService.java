package springsession.restwithspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springsession.restwithspring.entities.Student;
import springsession.restwithspring.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void saveAllStudents(List<Student> studentList) {
        studentRepository.saveAll(studentList);
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {

        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.isPresent() ? studentOptional.get() : null;
    }
}
