package login.bean;

import java.io.Serializable;

/**
 * System:                 CleanBnB
 * Name:                   Login
 * Description:            Class that represents a Login's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/20/21
 */
public class Login implements Serializable
{

    private String name;
    private String password;


    public Login() {

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean autenticacion(){
        return (password.equals("jamal123"))?true:false;
    }

}

