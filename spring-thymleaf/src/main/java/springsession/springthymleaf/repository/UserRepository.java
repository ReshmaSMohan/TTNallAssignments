package springsession.springthymleaf.repository;

import org.springframework.data.repository.CrudRepository;
import springsession.springthymleaf.entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {

    Optional<User> findById(Integer id);
}
