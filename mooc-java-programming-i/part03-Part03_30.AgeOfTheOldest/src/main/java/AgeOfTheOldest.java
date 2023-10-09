
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            int currentAge = Integer.valueOf(pieces[1]);
            if (currentAge > oldest) {
                oldest = currentAge;
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
