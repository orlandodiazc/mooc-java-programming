
import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("Give an integer: ");
        int integerValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double doubleValue = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean booleanValue = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + stringValue);
        System.out.println("You gave the integer " + integerValue);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + booleanValue);     
    }
}
