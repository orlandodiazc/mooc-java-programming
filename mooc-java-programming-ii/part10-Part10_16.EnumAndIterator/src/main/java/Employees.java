
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        employees = new ArrayList();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        employees.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person curr = iterator.next();
            if (curr.getEducation() == education) {
                System.out.println(curr);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
