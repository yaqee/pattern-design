package creation.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();


    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0f;
        for (int i = 0; i < items.size(); i++) {
            cost += items.get(i).getPrice();
        }

        return cost;
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.println("Item: " + item.getName());
            System.out.println(", Packing: " + item.packing().pack());
            System.out.println(", price: " + item.getPrice());
        });
    }
}
