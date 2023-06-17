public class CafeJava {
    // Main Method
    public static void main(String[] args) {
        // App Variables
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready in just a moment!\n";
        String readyMessage = ", your order is ready!\n";
        String totalPriceMessage = "Your total is $";

        // Menu Variables
        double mocha = 4.75;
        double cappuccino = 5.50;
        double latte = 3.95;
        double drip = 2.45;

        // Customer Variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order Completion Variables
        boolean isReadyOrder001 = false;
        boolean isReadyOrder002 = true;
        boolean isReadyOrder003 = false;
        boolean isReadyOrder004 = true;

        // App Sim
        // 1
        System.out.println(generalGreeting + customer1 + "!");
        // Cindhuri orders a coffee.
        System.out.println(totalPriceMessage + (String.format("%.2f", drip)) + ".");
        if (isReadyOrder001) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        // 2
        System.out.println(generalGreeting + customer4 + "!");
        // Noah orders a cappuccino.
        System.out.println(totalPriceMessage + (String.format("%.2f", cappuccino)) + ".");
        if (isReadyOrder004) {
            System.out.println(customer4 + readyMessage);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        // 3
        System.out.println(generalGreeting + customer2 + "!");
        // Sam orders a two lattes.
        System.out.println(totalPriceMessage + (String.format("%.2f", latte*2)) + ".");
        if (isReadyOrder002) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // 4
        System.out.println(generalGreeting + customer3 + "!");
        // Jimmy accidentally orders a coffee.
        System.out.println(totalPriceMessage + (String.format("%.2f", drip)) + ".");
        // Jimmy pays the remaining amount for the price of a latte.
        System.out.println("- drip coffee");
        System.out.println("+ latte");
        System.out.println("Balance: " + totalPriceMessage + (String.format("%.2f", (latte - drip))) + ".");
        if (isReadyOrder003) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
    }
}