package ProjectJavaOOP.Restaurant.Model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private List<Order> customerOrder = new ArrayList<>();

    public Customer(String customerName, String customerPassword) {
        super(customerName, customerPassword);
    }

    public void viewMenu(ArrayList<Dish> menu) {
        System.out.println("===== Our Menu =====");
        System.out.println("ID      Name      Price");
        for (Dish dish : menu) {
            System.out.println(dish.getDishID() + "      " + dish.getDishName() + "      " + dish.getDishPrice() + "$");
        }
    }

    public Order makeOrder(Dish dish, int quantity) {
        Order order = new Order(dish, quantity, this);
        customerOrder.add(order);
        return order;
    }

    public List<Order> getCustomerOrder() {
        return customerOrder;
    }
}