package id.ac.uinsgd.springbootforgotpw.forgotPW.service.framework;

import id.ac.uinsgd.springbootforgotpw.forgotPW.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    @Override
    UserDetails loadUserByUsername (String username) throws UsernameNotFoundException;

    void updatePassword(User user);

    User save(User user);
}
