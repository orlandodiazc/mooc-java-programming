
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> positions;

    public Herd() {
        positions = new ArrayList();
    }

    public void addToHerd(Movable movable) {
        positions.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable mov : positions) {
            mov.move(dx, dy);
        }
    }

    public String toString() {
        String output = "";
        for (Movable mov : positions) {
            output += mov.toString() + "\n";
        }
        return output;
    }

}
