package ProjectJavaOOP.Bank.Model;

import java.util.List;

public class Customer extends User {

    private List<Account> Account;

    public Customer(String customerUser, String customerPassword) {
        super(customerUser, customerPassword);
    }

    public void viewBalance() {
        
    }
    
    public void transferFund() {

    }
    
    public void viewTransaction() {
        
    }
}