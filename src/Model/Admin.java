package Model;

public class Admin extends User {

    
    private String userName;
    private String password;
    
    public Admin(String id,String userName,String password) {
        super(id);
    }

    public Admin(String fullName, String email, String address, String userName, String password) {
        super(fullName, email, address);
        this.userName=userName;
        this.password=password;
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
}
