
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        if (message.equals("true")) {
            System.out.println("You got it right");
        } else {
            System.out.println("Try again!");
        }
    }
}
