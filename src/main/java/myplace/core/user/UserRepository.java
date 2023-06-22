package myplace.core.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User member);
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
}