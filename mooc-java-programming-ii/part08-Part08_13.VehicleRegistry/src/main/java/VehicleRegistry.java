
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        vehicles = new HashMap();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicles.containsKey(licensePlate)) {
            return false;
        }
        vehicles.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return vehicles.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!vehicles.containsKey(licensePlate)) {
            return false;
        }
        vehicles.remove(licensePlate);
        return true;

    }

    public void printLicensePlates() {
        for (LicensePlate plate : vehicles.keySet()) {
            System.out.println(plate.toString());
        }
    }

    public void printOwners() {
        ArrayList<String> printedNames = new ArrayList();
        for (String plate : vehicles.values()) {
            if (!printedNames.contains(plate)) {
                printedNames.add(plate);
                System.out.println(plate);
            }

        }
    }
}
