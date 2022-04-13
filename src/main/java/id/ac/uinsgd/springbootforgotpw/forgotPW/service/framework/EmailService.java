package id.ac.uinsgd.springbootforgotpw.forgotPW.service.framework;

import id.ac.uinsgd.springbootforgotpw.forgotPW.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}
