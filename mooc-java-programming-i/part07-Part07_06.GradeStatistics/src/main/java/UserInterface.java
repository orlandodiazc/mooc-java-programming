
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Grades gradeStatistics;

    public UserInterface(Scanner scan, Grades gradeStatistics) {
        this.scan = scan;
        this.gradeStatistics = gradeStatistics;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int score = Integer.valueOf(scan.nextLine());
            if (score == -1) {
                break;
            }
            gradeStatistics.add(score);
        }

        System.out.println("Point average (all): " + gradeStatistics.averageAll());

        double passingAverage = gradeStatistics.averagePassing();
        if (passingAverage == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage);
        }

        System.out.println("Pass percentage: " + gradeStatistics.passPercentage());

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            int amountOfGrades = gradeStatistics.amountOfGrades(i);
            System.out.print(i + ": ");
            printStars(amountOfGrades);
            System.out.println();
        }
    }

    private static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
    }
}
