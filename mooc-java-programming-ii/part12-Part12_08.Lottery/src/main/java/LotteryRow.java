
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.numbers = new ArrayList();
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int newNumber = random.nextInt(40) + 1;
            while (containsNumber(newNumber)) {
                newNumber = random.nextInt(40) + 1;
            }
            this.numbers.add(newNumber);
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }

}
