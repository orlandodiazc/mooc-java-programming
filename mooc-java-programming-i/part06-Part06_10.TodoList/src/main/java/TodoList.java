
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String task) {
        todos.add(task);
    }

    public void print() {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println((i + 1) + ": " + todos.get(i));
        }
    }

    public void remove(int number) {
        todos.remove(number - 1);
    }
}
