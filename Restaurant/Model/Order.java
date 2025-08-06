package ProjectJavaOOP.Restaurant.Model;

public class Order {

    private static int orderCount = 1;
    private int orderID;
    private Customer customer;
    private Dish dish;
    private int orderQuantity;
    private OrderStatus orderStatus;

    public Order(Dish dish, int orderQuantity, Customer customer) {
        this.orderID = orderCount++;
        this.orderQuantity = orderQuantity;
        this.dish = dish;
        this.customer = customer;
        this.orderStatus = orderStatus.PENDING;
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Dish getDish() {
        return dish;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatue(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}