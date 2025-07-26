package ProjectJavaOOP.Restaurant.Model;

import java.util.ArrayList;

public class Customer extends User {

    private ArrayList<User> customerList;

    public void userRegister(String customerUser, String customerPassword, String passwordConfirm) {
        if (customerPassword.equals(passwordConfirm)) {
            setUserName(customerUser);
            setUserPassword(customerPassword);
        } else {
            System.out.println("Not Matched Password");
        }
    }

    @Override
    public void userLogin(String customerUser, String customerPassword) {

    }
}