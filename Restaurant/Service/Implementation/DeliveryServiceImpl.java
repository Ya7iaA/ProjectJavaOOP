package ProjectJavaOOP.Restaurant.Service.Implementation;

import ProjectJavaOOP.Restaurant.Data.OrderData;
import ProjectJavaOOP.Restaurant.Model.Order;
import ProjectJavaOOP.Restaurant.Model.OrderStatus;
import ProjectJavaOOP.Restaurant.Service.Interfaces.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {

    @Override
    public void updateOrderStatue(int orderID, OrderStatus orderStatus) {
        for (Order order : OrderData.order) {
            if (order.getOrderID() == orderID) {
                order.setOrderStatue(orderStatus);
                System.out.println("Statue updated.");
                return;
            }
        }
        System.out.println("Invalid Order");
    }

    @Override
    public void viewOrders() {
        for (Order order : OrderData.order) {
            if (order.getOrderStatus() == OrderStatus.READY_FOR_DELIVERY) {
                System.out.println(order);
            }
        }
    }
}