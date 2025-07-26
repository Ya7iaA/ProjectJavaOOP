package ProjectJavaOOP.Restaurant.Model;

public class Dish {

    private String dishName;
    private double dishPrice;

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public double getDishPrice() {
        return dishPrice;
    }
}