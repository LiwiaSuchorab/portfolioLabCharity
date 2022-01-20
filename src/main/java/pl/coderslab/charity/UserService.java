package pl.coderslab.charity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.entity.User;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@Service
public interface UserService {

    User findByUserName(String name);
    @Transactional
    void save(User user, String siteURL) throws MessagingException, UnsupportedEncodingException;

    @Transactional
    void saveAdmin(User user);

    @Transactional
    void sendVerificationEmail(User user, String siteURL) throws MessagingException, UnsupportedEncodingException;

    @Transactional
    boolean verify(String verificationCode);
}