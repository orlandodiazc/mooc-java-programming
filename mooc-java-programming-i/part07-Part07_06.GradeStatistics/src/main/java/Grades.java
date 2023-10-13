
import java.util.ArrayList;

public class Grades {

    ArrayList<Integer> scoreCollection;
    ArrayList<Integer> gradeCollection;

    public Grades() {
        scoreCollection = new ArrayList();
        gradeCollection = new ArrayList();
    }

    public void add(int score) {
        if (score < 0 || score > 100) {
            return;
        }
        scoreCollection.add(score);
        if (score < 50) {
            gradeCollection.add(0);
        } else if (score < 60) {
            gradeCollection.add(1);
        } else if (score < 70) {
            gradeCollection.add(2);
        } else if (score < 80) {
            gradeCollection.add(3);
        } else if (score < 90) {
            gradeCollection.add(4);
        } else {
            gradeCollection.add(5);
        }
    }

    public int amountOfGrades(int grade) {
        if (grade < 0 || grade > 5) {
            return -1;
        }
        int sum = 0;
        for (int g : gradeCollection) {
            if (grade == g) {
                sum++;
            }
        }
        return sum;
    }

    public double averageAll() {
        int sum = 0;
        for (int score : scoreCollection) {
            sum += score;
        }
        return 1.0 * sum / scoreCollection.size();
    }

    public double averagePassing() {
        ArrayList<Integer> passingGrades = new ArrayList();
        for (int score : scoreCollection) {
            if (score >= 50) {
                passingGrades.add(score);
            }
        }
        int sum = 0;
        for (int score : passingGrades) {
            sum += score;

        }
        return 1.0 * sum / passingGrades.size();
    }

    public double passPercentage() {
        int passers = 0;
        for (int score : scoreCollection) {
            if (score >= 50) {
                passers++;
            }
        }
        return 100.0 * passers / scoreCollection.size();
    }

}
