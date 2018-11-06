package lk.hdconstructions.erp.models;

/**
 *
 * @author Malith Bandara
 */
public class User {
    
    private String username;
    private String password;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    
    // validate username and password entered by user on login
    public boolean validateUser(String username, String password){
        if(this.username == username && this.password == password)
            return true;
        
        return false;
    }
    
}
