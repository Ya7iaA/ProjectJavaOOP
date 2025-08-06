package ProjectJavaOOP.Restaurant.Model;

import java.util.List;

public class Delivery extends User {

    public Delivery(String deliveryName, String deliveryPassword) {
        super(deliveryName, deliveryPassword);
    }

    public void viewOrders(List<Order> orders) {
        for (Order order : orders) {
            if (order.getOrderStatus() == OrderStatus.READY_FOR_DELIVERY) {
                System.out.println(order);
            }
        }
    }

    public void updateOrderStatus(Order order, OrderStatus orderStatus) {
        order.setOrderStatue(orderStatus);
    }
}