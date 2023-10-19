
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> items;

    public Pipe() {
        this.items = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        items.add(value);
    }

    public T takeFromPipe() {
        if (items.size() > 0) {
            return items.remove(0);
        }
        return null;
    }

    public boolean isInPipe() {
        return !items.isEmpty();
    }
}
