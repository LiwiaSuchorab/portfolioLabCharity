package pl.coderslab.charity.entity;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
/*import pl.coderslab.charity.constraint.FieldMatch;

import javax.validation.constraints.AssertTrue;

@FieldMatch.List({
        @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
        @FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match")
})*/
public class UserRegistrationDto {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String confirmPassword;

    @Email
    @NotEmpty
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}