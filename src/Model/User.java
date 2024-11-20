package Model;

public class User {
    private String id;
    private String name;
    private String email;
    private String userType;
    private String address;

    public User(String id) {
        this.id=id;
    }

    public User(String fullName,String email,String address) {
        name=fullName;
        this.email=email;
        this.address=address;
        this.userType="member";
    }
    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return "admin";
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
enum UserType {
    ADMIN,
    MEMBER
}