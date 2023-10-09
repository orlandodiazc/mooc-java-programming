
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        boolean isItAlex = username.equals("alex") && password.equals("sunshine");
        boolean isItEmma = username.equals("emma") && password.equals("haskell");
        if (isItAlex || isItEmma) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
