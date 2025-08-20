package ProjectJavaOOP.Restaurant.Model;

public abstract class User {

    private String userName;
    private String userPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public boolean checkUserName(String userName) {
        return this.userName.equals(userName);
    }

    public boolean checkPassword(String userPassword) {
        return this.userPassword.equals(userPassword);
    }
}