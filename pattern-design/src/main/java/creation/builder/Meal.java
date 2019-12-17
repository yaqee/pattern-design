package creation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0;
        for(Item item: items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item: items) {
            System.out.println(item.name() + ":");
            System.out.println("    包装:" + item.packing().pack() + ",");
            System.out.println("    价格:" + item.price());
        }
    }


}
