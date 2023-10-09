
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int amountOfInputs = 0;
        int nameLength = -1;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");

            int lenghtOfPiece = pieces[0].length();
            if (lenghtOfPiece > nameLength) {
                nameLength = lenghtOfPiece;
                longestName = pieces[0];
            }
            int birthYear = Integer.valueOf(pieces[1]);
            sum = sum + birthYear;
            amountOfInputs++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / amountOfInputs));
    }
}
