
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;

    public Warehouse() {
        productPrices = new HashMap();
        productStocks = new HashMap();
    }

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStocks.put(product, stock);
    }

    public int price(String product) {
        return productPrices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return productStocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (!productStocks.containsKey(product)) {
            return false;
        }
        int stock = productStocks.get(product);
        if (stock <= 0) {
            return false;
        }

        productStocks.put(product, stock - 1);
        return true;
    }

    public Set<String> products() {
        return productPrices.keySet();
    }
}
