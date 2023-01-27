//create a similar multilevel inheritence including Models.MainCategory, Models.Category And Items where Models.Category is child class of Models.MainCategory and Items is child class of Items  and also make class Models.Order and class Models.Customer where customer class is inside order and order should have array list of item .
//Make a Main class where we can access customer and make a method to print the bill when the name of the customer is inserted it must generate his bill.
//Models.Item should have get item detail which should give info about its category and Main category use construtors for all the classes and add properties to each of them.

import Model.Customer;
import Model.Order;
import Model.Customer;
import Model.Items;
import Model.Main_Category;
import Model.Main_Category;
import jdk.jfr.Category;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Model.Main_Category food = new Main_Category("Food");
        Model.Main_Category drinks = new Main_Category("Drinks");

        Category appetizers = new Category(food, "Appetizers");
        Category entrees = new Category(food, "Entrees");
        Category desserts = new Category(food, "Desserts");

        Category beer = new Category(drinks,"Whisky");
        Category wine = new Category(drinks,"Wine");
        Category cocktails = new Category(drinks,"Cocktails");

        Items item1 = new Items("Lays", "appetizers", 8.99);
        Items item2 = new Items("Steak", "entrees", 19.99);
        Items item3 = new Items("Chocolate Cake", "desserts", 5.99);
        Items item4 = new Items("Famous Grouse", "whisky", 6.99);
        Items item5 = new Items("Chardonnay", "wine", 9.99);
        Items item6 = new Items("Margarita", "cocktails", 11.99);

        ArrayList<Items> item = new ArrayList<>();
        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.add(item4);
        item.add(item5);
        item.add(item6);

        Customer customer = new Customer("John Smith", "123 Main St");
        Order order = new Order(customer, Items);

        printBill(order, "John Smith");
    }

    public static void printBill(Order order, String customerName) {
        if (order.getCustomer().getName().equals(customerName)) {
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("Address: " + order.getCustomer().getAddress());
            System.out.println("Order:");

            double total = 0;
            for (Items item: order.getItems()) {
                System.out.println("Name: " + item.getItemName());
                System.out.println("Category: " + item.getCategoryName());
                System.out.println("Main Category: " + item.getMain_CategoryName());
                System.out.println("Price: $" + item.getPrice());
                total += item.getPrice();
            }

            System.out.println("Total: $" + total);
        } else {
            System.out.println("No order found for customer " + customerName);
        }
    }
}