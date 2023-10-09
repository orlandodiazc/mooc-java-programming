
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int maxCount = Integer.valueOf(scanner.next());
        System.out.print("Where from? ");
        int minCount = Integer.valueOf(scanner.next());
        for (int i = minCount; i <= maxCount; i++) {
            System.out.println(i);
        }
    }
}
