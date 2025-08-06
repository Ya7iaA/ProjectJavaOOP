package ProjectJavaOOP.Restaurant.Service.Interfaces;

import ProjectJavaOOP.Restaurant.Model.OrderStatus;

public interface ChefService {

    void addDish(String dishName, double dishPrice);

    void editDish(String oldName, String newName, double newPrice);

    void viewOrder();

    void updateOrderStatue(String orderID, OrderStatus orderStatus);
}