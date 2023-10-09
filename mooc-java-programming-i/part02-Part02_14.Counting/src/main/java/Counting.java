
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCount = Integer.valueOf(scanner.next()) + 1;
        for (int i = 0; i < maxCount; i++) {
            System.out.println(i);
        }
    }
}
