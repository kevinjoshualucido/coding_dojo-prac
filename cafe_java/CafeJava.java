public class CafeJava {
    public static void main(String[] args) {
        // App Variables
        // lines of text that will appear in the app
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu Variables
        double dripCoffeePrice = 5.95;
        double caramelLattePrice = 7.95;
        double mochaCappuccinoPrice = 8.95;

        // Customer Name Variable
        String customer1 = "Sam";
        String customer2 = "Jimmy";
        String customer3 = "Noah";
        String customer4 = "Cindhuri";

        // Order Completion
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        // App Interaction Simulation
        // Cindhuri:
        System.out.println("--------------------------------");
        System.out.println(generalGreeting + customer4);
        // Cindhuri ordered a drip coffee.
        System.out.println(customer4 + pendingMessage);
        System.out.println("--------------------------------");

        // Noah:
        System.out.println("--------------------------------");
        System.out.println(generalGreeting + customer3);
        // Noah ordered a cappuccino. Is the order ready?
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + mochaCappuccinoPrice);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
        System.out.println("--------------------------------");

        // Sam:
        System.out.println("--------------------------------");
        System.out.println(generalGreeting + customer1);
        // Sam ordered 2 lattes.
        System.out.println(displayTotalMessage + caramelLattePrice * 2);
        // Is the order ready?
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        System.out.println("--------------------------------");

        // Jimmy:
        System.out.println("--------------------------------");
        System.out.println(generalGreeting + customer2);
        // Jimmy ordered a latte. Instead, he was charged a drip coffee.
        double balanceOwed = caramelLattePrice - dripCoffeePrice;
        System.out.println(displayTotalMessage + balanceOwed);
        System.out.println("--------------------------------");

    }
}