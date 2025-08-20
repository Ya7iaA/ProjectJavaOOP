package ProjectJavaOOP.EWallet.Model;

public class Account {

    private String userName;
    private String userPassword;
    private double userAmount;
    private String userPhone;

    public Account(String userName, String userPassword, String userPhone) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAmount = 0;
        this.userPhone = userPhone;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return this.userName;
    }

    public double getUserAmount() {
        return userAmount;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    @Override
    public String toString() {
        return "userName : " + userName + ", userAmount : " + userAmount;
    }
}