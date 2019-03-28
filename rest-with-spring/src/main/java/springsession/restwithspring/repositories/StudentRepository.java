package springsession.restwithspring.repositories;

import org.springframework.data.repository.CrudRepository;
import springsession.restwithspring.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
