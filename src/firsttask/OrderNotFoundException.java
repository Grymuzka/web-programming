package firsttask;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(int orderId) {
        super("Order with ID " + orderId + " not found.");
    }
}
