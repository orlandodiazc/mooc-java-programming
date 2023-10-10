
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void add(String value) {
        list.add(value);
    }

    public ArrayList<String> values() {
        return list;
    }

    public String take() {
        int lastIndex = list.size() - 1;
        String lastItem = list.get(lastIndex);
        list.remove(lastIndex);
        return lastItem;
    }
}
