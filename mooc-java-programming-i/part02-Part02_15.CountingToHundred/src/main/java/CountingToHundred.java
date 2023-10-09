
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minCount = Integer.valueOf(scanner.next());
        for (int i = minCount; i < 101; i++) {
            System.out.println(i);
        }
    }
}
