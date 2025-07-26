package ProjectJavaOOP.Restaurant.Model;

public abstract class User {

    private String userName;
    private String userPassword;

    public abstract void userLogin(String userName, String userPassword);

    public void setUserName(String userName) {
        if (userName.length() > 2) {
            this.userName = userName;
            return;
        }
        System.out.println("InValid User");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserPassword(String userPassword) {
        if (userPassword.length() > 5) {
            this.userPassword = userPassword;
            return;
        }
        System.out.println("InValid Password");
    }

    public String getUserPassword() {
        return userPassword;
    }
}