package ProjectJavaOOP.Restaurant.Service.Implementation;

import ProjectJavaOOP.Restaurant.Service.Interfaces.ChefService;
import ProjectJavaOOP.Restaurant.Data.DishData;
import ProjectJavaOOP.Restaurant.Data.OrderData;
import ProjectJavaOOP.Restaurant.Model.Dish;
import ProjectJavaOOP.Restaurant.Model.Order;
import ProjectJavaOOP.Restaurant.Model.OrderStatus;

public class ChefServiceImpl implements ChefService {

    @Override
    public void addDish(String dishName, double dishPrice) {
        DishData.dish.add(new Dish(dishName, dishPrice));
        System.out.println("Dish Added");
    }

    @Override
    public void editDish(String oldName, String newName, double newPrice) {
        for (Dish dish : DishData.dish) {
            if (dish.getDishName().equals(oldName)) {
                dish.setDishName(newName);
                dish.setDishPrice(newPrice);
                System.out.println("Dish Edited");
                return;
            }
        }
        System.out.println("Invalid Dish");
    }

    @Override
    public void updateOrderStatue(int orderID, OrderStatus orderStatus) {
        for (Order order : OrderData.order) {
            if (order.getOrderID() == orderID) {
                order.setOrderStatue(orderStatus);
                System.out.println("Statue Update");
                return;
            }
        }
        System.out.println("Invalid Order");
    }

    @Override
    public void viewOrder() {
        for (Order order : OrderData.order) {
            System.out.println(order);
        }
    }
}
