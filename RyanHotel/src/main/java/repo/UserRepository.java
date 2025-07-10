package repo;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean exitsByEmail(String email);

    Optional<User> findByEmail(String email);

}
