import firsttask.Order;
import firsttask.OrderAlreadyExistsException;
import firsttask.OrderManager;
import firsttask.OrderNotFoundException;

public class Main {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        try {
            manager.addOrder(new Order(1, "buty", 1));
        } catch (OrderAlreadyExistsException e) {
            System.err.println(e.getMessage());
        }
        try {
            manager.addOrder(new Order(1, "koc", 3));
        } catch (OrderAlreadyExistsException e) {
            System.err.println(e.getMessage());
        }

        try {
            Order order = manager.getOrder(1);
            System.out.println("Order ID: " + order.getOrderId());
        } catch (OrderNotFoundException e) {
            System.err.println(e.getMessage());
        }

        try {
            boolean removed = manager.removeOrder(1);
            System.out.println("Order removed: " + removed);
        } catch (OrderNotFoundException e) {
            System.err.println(e.getMessage());
        }

        try {
            manager.removeOrder(3);
        } catch (OrderNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}