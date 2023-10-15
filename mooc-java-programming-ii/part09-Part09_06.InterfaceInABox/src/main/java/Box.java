
import java.util.ArrayList;

public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maxWeight) {
            items.add(item);
        }
    }

    public double weight() {
        double totalWeight = 0;
        for (Packable I : items) {
            totalWeight += I.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {

        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }

}
