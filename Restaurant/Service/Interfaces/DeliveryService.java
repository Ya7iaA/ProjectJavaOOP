package ProjectJavaOOP.Restaurant.Service.Interfaces;

import ProjectJavaOOP.Restaurant.Model.OrderStatus;

public interface DeliveryService {

    void viewOrders();

    void updateOrderStatue(int orderID, OrderStatus orderStatue);
}