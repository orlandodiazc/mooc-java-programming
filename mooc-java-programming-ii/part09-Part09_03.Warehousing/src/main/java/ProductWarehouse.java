
public class ProductWarehouse extends Warehouse {

    private String name;

    public ProductWarehouse(String name, double capacity, double initialBalance) {
        super(capacity, initialBalance);
        this.name = name;
    }

    public ProductWarehouse(String name, double capacity) {
        this(name, capacity, 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + super.toString();
    }

}
