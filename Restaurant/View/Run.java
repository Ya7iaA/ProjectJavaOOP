package ProjectJavaOOP.Restaurant.View;

import java.util.Scanner;
import ProjectJavaOOP.Restaurant.Data.DishData;
import ProjectJavaOOP.Restaurant.Data.UserData;
import ProjectJavaOOP.Restaurant.Model.Chef;
import ProjectJavaOOP.Restaurant.Model.Customer;
import ProjectJavaOOP.Restaurant.Model.Delivery;
import ProjectJavaOOP.Restaurant.Model.Dish;
import ProjectJavaOOP.Restaurant.Model.OrderStatus;
import ProjectJavaOOP.Restaurant.Service.Implementation.ChefServiceImpl;
import ProjectJavaOOP.Restaurant.Service.Implementation.CustomerServiceImpl;
import ProjectJavaOOP.Restaurant.Service.Implementation.DeliveryServiceImpl;

public class Run {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        seedData();

        while (true) {
            System.out.println("\n===== Restaurant Management System =====");
            System.out.println("1. Customer");
            System.out.println("2. Chef");
            System.out.println("3. Delivery Guy");
            System.out.println("0. Exit");
            System.out.print("Choose Role: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0)
                break;

            if (choice == 1)
                customerPage();
            else if (choice == 2)
                chefLogin();
            else if (choice == 3)
                deliveryLogin();
            else
                System.out.println("Invalid choice. Try again.");
        }
    }

    private void customerPage() {
        while (true) {
            System.out.println("\n--- Customer Page ---");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0)
                break;
            else if (choice == 1)
                customerLogin();
            else if (choice == 2)
                customerRegister();
            else
                System.out.println("Invalid choice.");
        }
    }

    private void customerLogin() {
        System.out.print("UserName: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Customer found = null;
        for (Customer customer : UserData.customer) {
            if (customer.getUserName().equals(userName) && customer.checkPassword(password)) {
                found = customer;
                break;
            }
        }

        if (found == null) {
            System.out.println("Invalid credentials.");
            return;
        }

        CustomerServiceImpl service = new CustomerServiceImpl(found);
        while (true) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. View Menu");
            System.out.println("2. Make Order");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0)
                break;
            else if (choice == 1)
                service.viewMenu();
            else if (choice == 2) {
                System.out.print("Dish Name: ");
                String dishName = scanner.nextLine();
                System.out.print("Quantity: ");
                int qty = scanner.nextInt();
                scanner.nextLine();
                service.makeOrder(dishName, qty);
            } else
                System.out.println("Invalid choice.");
        }
    }

    private void customerRegister() {
        System.out.print("New UserName: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (Customer customer : UserData.customer) {
            if (customer.getUserName().equals(userName)) {
                System.out.println("UserName already taken.");
                return;
            }
        }

        UserData.customer.add(new Customer(userName, password));
        System.out.println("Registration successful.");
    }

    private void chefLogin() {
        System.out.print("UserName: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Chef found = null;
        for (Chef chef : UserData.chef) {
            if (chef.getUserName().equals(userName) && chef.checkPassword(password)) {
                found = chef;
                break;
            }
        }

        if (found == null) {
            System.out.println("Invalid credentials.");
            return;
        }

        ChefServiceImpl service = new ChefServiceImpl();
        while (true) {
            System.out.println("\n--- Chef Menu ---");
            System.out.println("1. Add Dish");
            System.out.println("2. Edit Dish");
            System.out.println("3. View Orders");
            System.out.println("4. Update Order Status");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0)
                break;
            else if (choice == 1) {
                System.out.print("Dish Name: ");
                String Name = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                service.addDish(Name, price);
            } else if (choice == 2) {
                System.out.print("Dish Name: ");
                String Name = scanner.nextLine();
                System.out.print("New Name: ");
                String newName = scanner.nextLine();
                System.out.print("New Price: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine();
                service.editDish(Name, newName, newPrice);
            } else if (choice == 3) {
                service.viewOrder();
            } else if (choice == 4) {
                System.out.print("Order ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("1. PENDING 2. READY_FOR_DELIVERY");
                int s = scanner.nextInt();
                scanner.nextLine();
                OrderStatus status = (s == 1) ? OrderStatus.PENDING : OrderStatus.READY_FOR_DELIVERY;
                service.updateOrderStatue(id, status);
            } else
                System.out.println("Invalid choice.");
        }
    }

    private void deliveryLogin() {
        System.out.print("UserName: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Delivery found = null;
        for (Delivery dg : UserData.delivery) {
            if (dg.getUserName().equals(userName) && dg.checkPassword(password)) {
                found = dg;
                break;
            }
        }

        if (found == null) {
            System.out.println("Invalid credentials.");
            return;
        }

        DeliveryServiceImpl service = new DeliveryServiceImpl();
        while (true) {
            System.out.println("\n--- Delivery Menu ---");
            System.out.println("1. View Ready Orders");
            System.out.println("2. Mark Order Delivered");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0)
                break;
            else if (choice == 1)
                service.viewOrders();
            else if (choice == 2) {
                System.out.print("Order ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                service.updateOrderStatue(id, OrderStatus.DELIVERED);
            } else
                System.out.println("Invalid choice.");
        }
    }

    private void seedData() {
        if (UserData.chef.isEmpty()) {
            UserData.chef.add(new Chef("chef1", "123"));
        }
        if (UserData.delivery.isEmpty()) {
            UserData.delivery.add(new Delivery("delivery1", "123"));
        }
        if (DishData.dish.isEmpty()) {
            DishData.dish.add(new Dish("Pizza", 10));
            DishData.dish.add(new Dish("Burger", 7));
        }
    }
}