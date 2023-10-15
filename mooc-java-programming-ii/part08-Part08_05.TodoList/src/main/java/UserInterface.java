
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todos;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.scanner = scanner;
        this.todos = todos;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("Task: ");
                String task = scanner.nextLine();
                todos.add(task);
            }

            if (command.equals("list")) {
                todos.print();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                todos.remove(index);
            }
        }
    }
}
