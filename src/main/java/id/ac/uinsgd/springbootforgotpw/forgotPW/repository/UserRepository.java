package id.ac.uinsgd.springbootforgotpw.forgotPW.repository;

import id.ac.uinsgd.springbootforgotpw.forgotPW.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
