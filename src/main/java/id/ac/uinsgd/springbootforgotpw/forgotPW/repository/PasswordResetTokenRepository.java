package id.ac.uinsgd.springbootforgotpw.forgotPW.repository;

import id.ac.uinsgd.springbootforgotpw.forgotPW.entity.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);
}
