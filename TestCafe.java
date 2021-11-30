import java.util.ArrayList;

public class TestCafe {
    public static void main (String[] args) {
        CafeUtil cafeApp = new CafeUtil();

        // Streak Goal
        int streakGoal = cafeApp.getStreakGoal();
        System.out.println("Purchases needed by week 10: " + streakGoal);

        // Order Total
        Double[] total = {2.50, 5.00, 3.50, 4.00};
        Double orderTotal = cafeApp.getOrderTotal(total);
        System.out.println("Order total: " + orderTotal);

        // Display Menu
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        cafeApp.displayMenu(menu);

        // Add Customer
        ArrayList<String> customer = new ArrayList<String>();
        cafeApp.addCustomer(customer);
    }
}
