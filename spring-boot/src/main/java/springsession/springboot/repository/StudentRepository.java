package springsession.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import springsession.springboot.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
