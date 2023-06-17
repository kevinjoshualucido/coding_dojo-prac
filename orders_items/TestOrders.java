import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu Variables
        // 1
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 5.25;
        // 2
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.95;
        // 3
        Item item3 = new Item();
        item3.name = "cappuccino";
        item3.price = 5.95;
        // 4
        Item item4 = new Item();
        item4.name = "drip coffee";
        item4.price = 3.95;

        // Order variables
        // 1
        Order order1 = new Order();
        order1.name = "Cindhuri";
        // 2
        Order order2 = new Order();
        order2.name = "Jimmy";
        // 3
        Order order3 = new Order();
        order3.name = "Noah";
        // 4
        Order order4 = new Order();
        order4.name = "Sam";

        /*
         * APP SIMULATION
         */
        // Print order1
        System.out.printf("Name: %s\n", order1); // prints object location

        // Add item1 to order2 item list
        order2.items.add(item1);
        order2.total += item1.price;

        // Add a cappuccino to order3
        order3.items.add(item3);
        order3.total += item3.price;

        // Add a latte to order4
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri's order is ready
        order1.ready = true;

        // Sam ordered 2 lattes
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price;

        // Jimmy's order is ready
        order2.ready = true;

        // CONSOLE
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Number of drinks: %s\n", order1.items.size());
        System.out.printf("Total: $%.2f\n", order1.total);
        System.out.printf("Ready: %s\n\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Number of drinks: %s\n", order2.items.size());
        System.out.printf("Total: $%.2f\n", order2.total);
        System.out.printf("Ready: %s\n\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Number of drinks: %s\n", order3.items.size());
        System.out.printf("Total: $%.2f\n", order3.total);
        System.out.printf("Ready: %s\n\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Number of drinks: %s\n", order4.items.size());
        System.out.printf("Total: $%.2f\n", order4.total);
        System.out.printf("Ready: %s\n\n", order4.ready);

    }
}
