
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades gradeStatistics = new Grades();
        UserInterface UI = new UserInterface(scanner, gradeStatistics);
        UI.start();
    }
}
