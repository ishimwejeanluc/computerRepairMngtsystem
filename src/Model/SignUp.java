package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author bluer
 */
@Entity

@Table(name = "signup")
public class SignUp implements Serializable{
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "user_id")
     private Integer userid;
 
 @Column(name = "Username")
 private String username;
 
 @Column(name = "Email")
 private String Email;
 
 @Column(name = "Telephone")
 private String telephone;
 
 @Column(name = "password")
 private String password;

    public SignUp() {
    }

    public SignUp(Integer userid) {
        this.userid = userid;
    }

    public SignUp(Integer userid, String username, String Email, String telephone, String password) {
        this.userid = userid;
        this.username = username;
        this.Email = Email;
        this.telephone = telephone;
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
 
 
}
