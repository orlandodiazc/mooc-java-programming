
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList();
    }

    @Override
    public void add(Item item) {
        int weight = 0;
        for (Item I : items) {
            weight += I.getWeight();
        }
        if (weight + item.getWeight() > maxWeight) {
            return;
        }
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item I : items) {
            if (I.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
