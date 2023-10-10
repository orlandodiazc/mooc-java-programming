
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personCollection;

    public Room() {
        personCollection = new ArrayList<>();
    }

    public void add(Person person) {
        personCollection.add(person);
    }

    public boolean isEmpty() {
        return personCollection.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return personCollection;
    }

    public Person shortest() {
        if (personCollection.isEmpty()) {
            return null;
        }

        Person shortest = personCollection.get(0);
        for (Person person : personCollection) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (personCollection.isEmpty()) {
            return null;
        }
        Person shortest = shortest();
        personCollection.remove(shortest);
        return shortest;
    }
}
