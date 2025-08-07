package ProjectJavaOOP.Bank.Service.Interfaces;

public interface CustomerService {

    public void viewAccount();

    public void transferFund(String targetAccount, double transferAmount);

    public void viewTransaction();
}