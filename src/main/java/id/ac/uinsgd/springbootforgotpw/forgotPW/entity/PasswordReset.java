package id.ac.uinsgd.springbootforgotpw.forgotPW.entity;

import id.ac.uinsgd.springbootforgotpw.forgotPW.validator.PasswordConfirmation;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@PasswordConfirmation(
        password = "password",
        confirmPassword = "confirmPassword",
        message = "PASSWORD_NOT_EQUAL"
)
public class PasswordReset {
    @NotEmpty
    private String password;

    @NotEmpty
    private String confirmPassword;

    @NotEmpty
    private String token;
}
