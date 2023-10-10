
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercise) {
        exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exerciseName) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(exerciseName)) {
                exercise.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exerciseName) {

        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(exerciseName)) {
                return exercise.isCompleted();
            }
        }
        return false;
    }
}
