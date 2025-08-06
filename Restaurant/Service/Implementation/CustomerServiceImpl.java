package ProjectJavaOOP.Restaurant.Service.Implementation;

import ProjectJavaOOP.Restaurant.Service.Interfaces.CustomerService;
import ProjectJavaOOP.Restaurant.Data.DishData;
import ProjectJavaOOP.Restaurant.Data.OrderData;
import ProjectJavaOOP.Restaurant.Model.Customer;
import ProjectJavaOOP.Restaurant.Model.Dish;
import ProjectJavaOOP.Restaurant.Model.Order;

public class CustomerServiceImpl implements CustomerService {

    private Customer customer;

    public CustomerServiceImpl(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void makeOrder(String dishName, int quantity) {
        for (Dish dish : DishData.dish) {
            if (dish.getDishName().equals(dishName)) {
                Order order = new Order(dish, quantity, customer);
                customer.makeOrder(dish, quantity);
                OrderData.order.add(order);
                System.out.println("Successful Addition");
                return;
            }
        }
        System.out.println("Invalid Dish");
    }

    @Override
    public void viewMenu() {
        for (Dish dish : DishData.dish) {
            System.out.println(dish);
        }
    }
}