
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = Integer.valueOf(scanner.nextLine());
        int result = number * number;
        System.out.println(result);
    }
}
