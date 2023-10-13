
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String action = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (action.equals("add")) {
                first.add(amount);
            } else if (action.equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
            } else {
                second.remove(amount);
            }
        }

    }
}
