
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numberCollection = new ArrayList<>();
        System.out.println("Enter numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numberCollection.add(input);
        }
        double average = numberCollection.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
