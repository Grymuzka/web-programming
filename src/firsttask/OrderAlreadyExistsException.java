package firsttask;

public class OrderAlreadyExistsException extends RuntimeException {

    public OrderAlreadyExistsException(int orderId) {
        super("Order with ID " + orderId + " already exists.");
    }
}
