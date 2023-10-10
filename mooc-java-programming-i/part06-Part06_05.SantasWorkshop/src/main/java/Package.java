
import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> giftCollection;

    public Package() {
        giftCollection = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        giftCollection.add(gift);
    }

    public int totalWeight() {
        if (giftCollection.isEmpty()) {
            return -1;
        }
        int totalWeight = 0;
        for (Gift gift : giftCollection) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }

}
