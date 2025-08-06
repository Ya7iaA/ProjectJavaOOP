package ProjectJavaOOP.Restaurant.Model;

public class Dish {

    private static int dishCount = 1;
    private int dishID;
    private String dishName;
    private double dishPrice;

    public Dish(String dishName, double dishPrice) {
        this.dishID = dishCount;
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

    @Override
    public String toString() {
        return "Dish [dishID=" + dishID + ", dishName=" + dishName + ", dishPrice=" + dishPrice + "]";
    }
}