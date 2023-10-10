
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> itemList;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.itemList = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        System.out.println(totalWeight() + item.getWeight());
        if (totalWeight() + item.getWeight() > maximumWeight) {
            return;
        }
        itemList.add(item);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : itemList) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        if (itemList.isEmpty()) {
            System.out.println("The suitcase is empty.");
        }
        System.out.println("The suitcase contains the following items:");
        for (Item item : itemList) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
        System.out.println("Total Weight: " + totalWeight() + " kg");
    }

    public Item heaviestItem() {
        if (itemList.isEmpty()) {
            return null;
        }

        Item heaviest = itemList.get(0);
        for (Item item : itemList) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if (itemList.isEmpty()) {
            return "no items (0 kg)";
        }
        if (itemList.size() == 1) {
            return itemList.size() + " item (" + totalWeight() + " kg)";
        }
        return itemList.size() + " items (" + totalWeight() + " kg)";
    }
}
