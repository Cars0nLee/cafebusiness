import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        int total = 0;
        for(int i=0; i<=10; i++){
            total += i;
        }
        return total;
    }
    public Double getOrderTotal(Double[] prices){
        Double orderTotal = 0.00;
        for (int i=0; i<prices.length; i++){
            orderTotal += prices[i];
        }
        return orderTotal;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i<menuItems.size(); i++){
            System.out.println( i + " " + menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customer){
        for(int i=0; i<=customer.size(); i++){
            System.out.println("Please enter your name:");
            String userName = System.console().readLine();
            System.out.println("Hello " + userName + "!");
            System.out.println("There are " + (i) + " people ahead of you.");
            customer.add(userName);
            System.out.println(customer);
        }
    }
}
