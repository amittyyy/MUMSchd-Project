package cs425.mumsched.web.usermgmt.boundary;

import cs425.mumsched.web.usermgmt.control.UserManager;
import cs425.mumsched.web.utils.HttpUtils;
import cs425.mumsched.web.utils.Identity;
import cs425.mumsched.web.utils.Messages;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author bikesh
 */
@Named
public class LoginBean implements Serializable {

    private String userName;
    private String password;

    @Autowired
    UserManager um;

    @Autowired
    Messages message;

    public LoginBean() {
        System.out.println("LOGIN BEAN CREATED");
    }

    public String doLogin() {
        System.out.println("doLogin Method called");
        return "/faces/home.xhtml?faces-redirect=true";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserManager getUm() {
        return um;
    }

    public void setUm(UserManager um) {
        this.um = um;
    }

    public Messages getMessage() {
        return message;
    }

    public void setMessage(Messages message) {
        this.message = message;
    }

}
