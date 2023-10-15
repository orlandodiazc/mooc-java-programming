
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> handCollection;

    public Hand() {
        handCollection = new ArrayList();
    }

    public void add(Card card) {
        handCollection.add(card);
    }

    public void print() {
        handCollection.stream().forEach(c -> System.out.println(c));
    }

    public void sort() {
        Collections.sort(handCollection);
    }

    public void sortBySuit() {
        Collections.sort(handCollection, new BySuitInValueOrder());
    }

    public int value() {
        return this.handCollection.stream()
                .map(c -> c.getValue())
                .reduce(0, (prev, curr) -> prev + curr);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.value() - hand.value();
    }
}
