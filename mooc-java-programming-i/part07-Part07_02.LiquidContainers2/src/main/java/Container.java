
public class Container {

    private int volume;

    public Container() {
        this.volume = 0;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        volume += amount;
        if (volume > 100) {
            volume = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        volume -= amount;
        if (volume < 0) {
            volume = 0;
        }
    }

    public int contains() {
        return volume;
    }

    @Override
    public String toString() {
        return volume + "/100";
    }
}
