
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }
    }

    private void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            todoList.print();
        } else {
            remove();
        }
    }

    private void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        todoList.add(task);
    }

    private void remove() {
        System.out.print("To remove: ");
        int id = Integer.valueOf(scanner.nextLine());
        todoList.remove(id);
    }

}
