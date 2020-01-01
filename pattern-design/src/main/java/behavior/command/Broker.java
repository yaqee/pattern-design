package behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(order -> order.execute());
        orderList.clear();
    }
}
