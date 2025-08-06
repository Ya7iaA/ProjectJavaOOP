package ProjectJavaOOP.Restaurant.Service.Implementation;

import ProjectJavaOOP.Restaurant.Model.Customer;
import ProjectJavaOOP.Restaurant.Service.Interfaces.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private Customer customer;

    public CustomerServiceImpl(Customer customer) {
        this.customer = customer;
    }
    @Override
    public void makeOrder(String dishName, int quantity) {
        // TODO Auto-generated method stub
        for (Dish dish : ) {
            
        }
    }

    @Override
    public void viewMenu() {
        // TODO Auto-generated method stub
        
    }

    
}
