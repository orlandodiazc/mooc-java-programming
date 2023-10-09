
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            int currentAge = Integer.valueOf(pieces[1]);
            if (currentAge > oldest) {
                oldest = currentAge;
                name = pieces[0];
            }
        }
        System.out.println("Age of the oldest: " + name);

    }
}
