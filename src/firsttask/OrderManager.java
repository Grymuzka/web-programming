package firsttask;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {

    private final Map<Integer, Order> orders = new HashMap<>();

    public void addOrder(Order order) {
        if (orders.containsKey(order.getOrderId())) {
            throw new OrderAlreadyExistsException(order.getOrderId());
        }
        orders.put(order.getOrderId(), order);
    }

    public boolean removeOrder(int id) {
        if (!orders.containsKey(id)) {
            throw new OrderNotFoundException(id);
        }
        orders.remove(id);
        return true;
    }

    public Order getOrder(int id) {
        if (!orders.containsKey(id)) {
            throw new OrderNotFoundException(id);
        }
        return orders.get(id);
    }
}