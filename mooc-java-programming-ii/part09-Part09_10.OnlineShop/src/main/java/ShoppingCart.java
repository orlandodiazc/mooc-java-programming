
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void add(String product, int price) {
        items.putIfAbsent(product, new Item(product, 0, price));
        items.get(product).increaseQuantity();
    }

    public int price() {
        int totalPrice = 0;
        for (Item I : items.values()) {
            totalPrice += I.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item I : items.values()) {
            System.out.println(I);
        }

    }

}
