
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storedItems;

    public StorageFacility() {
        storedItems = new HashMap();
    }

    public void add(String unit, String item) {
        storedItems.putIfAbsent(unit, new ArrayList());
        storedItems.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storedItems.getOrDefault(storageUnit, new ArrayList());
    }

    public void remove(String storageUnit, String item) {
        storedItems.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> result = new ArrayList();
        for (String unitName : storedItems.keySet()) {
            if (storedItems.get(unitName).size() > 0) {
                result.add(unitName);
            }
        }
        return result;
    }
}
