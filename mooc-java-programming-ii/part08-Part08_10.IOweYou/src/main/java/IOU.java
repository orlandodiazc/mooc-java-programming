
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> collection;

    public IOU() {
        collection = new HashMap();
    }

    public void setSum(String toWhom, double amount) {
        collection.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return collection.getOrDefault(toWhom, 0.0);
    }

}
