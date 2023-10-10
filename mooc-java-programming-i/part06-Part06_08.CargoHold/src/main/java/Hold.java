
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcaseList;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcaseList = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() > maximumWeight) {
            return;
        }
        suitcaseList.add(suitcase);
    }

    private int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcaseList) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        if (suitcaseList.isEmpty()) {
            System.out.println("The hold is empty.");
        }
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : suitcaseList) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return suitcaseList.size() + " suitcases (" + totalWeight() + " kg)";
    }

}
