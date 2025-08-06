package ProjectJavaOOP.Restaurant.Model;

public class Dish {

    private int dishID;
    private String dishName;
    private double dishPrice;

    public Dish(int dishID, String dishName, double dishPrice) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

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

    public int getDishID() {
        return dishID;
    }
}