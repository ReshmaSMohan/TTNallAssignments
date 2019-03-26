package springsession.springthymleaf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springsession.springthymleaf.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,String> {
}
