
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokeList = new ArrayList<>();

    public void addJoke(String joke) {
        jokeList.add(joke);
    }

    public String drawJoke() {
        if (jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(jokeList.size());
        return jokeList.get(index);
    }

    public void printJokes() {
        for (String joke : jokeList) {
            System.out.println(joke);
        }
    }
}
