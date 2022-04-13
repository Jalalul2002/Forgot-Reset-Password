package id.ac.uinsgd.springbootforgotpw.forgotPW.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class PasswordReset {
    @NotEmpty
    private String password;

    @NotEmpty
    private String confirmPassword;

    @NotEmpty
    private String token;
}
