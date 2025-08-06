package ProjectJavaOOP.Restaurant.Model;

import java.util.List;

public class Chef extends User {

    public Chef(String chefName, String chefPassword) {
        super(chefName, chefPassword);
    }

    public Dish addDish(int dishID, String dishName, double dishPrice) {
        return new Dish(dishID, dishName, dishPrice);
    }

    public void editDish(Dish dish, String dishName, double dishPrice) {
        dish.setDishName(dishName);
        dish.setDishPrice(dishPrice);
    }

    public void viewOrder(List<Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void updateOrderStatus(Order order, OrderStatus orderStatus) {
        order.setOrderStatue(orderStatus);
    }
}