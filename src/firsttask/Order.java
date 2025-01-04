package firsttask;

import java.util.Objects;

public class Order {

    private final Integer orderId;

    private final String product;

    private final int quantity;

    public Order(Integer orderId, String product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public Integer getOrderId() {
        return orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return quantity == order.quantity && Objects.equals(orderId, order.orderId) && Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, product, quantity);
    }
}
