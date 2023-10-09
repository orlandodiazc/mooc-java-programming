
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfPositives = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }
            sum = sum + number;
            numberOfPositives = numberOfPositives + 1;
        }
        if (numberOfPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0 * sum / numberOfPositives;
            System.out.println("Average of the numbers: " + average);
        }

    }
}
