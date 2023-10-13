
import java.util.ArrayList;

public class BirdCollection {

    private ArrayList<Bird> birds;

    public BirdCollection() {
        this.birds = new ArrayList();
    }

    public void add(Bird bird) {
        birds.add(bird);
    }

    public Bird findBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public boolean observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String output = "";
        for (Bird bird : birds) {
            output += bird.toString() + "\n";
        }
        return output; //To change body of generated methods, choose Tools | Templates.
    }

}
