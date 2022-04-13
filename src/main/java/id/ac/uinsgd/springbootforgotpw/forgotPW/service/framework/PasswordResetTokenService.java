package id.ac.uinsgd.springbootforgotpw.forgotPW.service.framework;

import id.ac.uinsgd.springbootforgotpw.forgotPW.entity.PasswordResetToken;

public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}
