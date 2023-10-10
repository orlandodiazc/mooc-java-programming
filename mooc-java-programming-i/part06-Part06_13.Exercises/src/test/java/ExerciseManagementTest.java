
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        Assert.assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");
        Assert.assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        Assert.assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        Assert.assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        Assert.assertFalse(management.isCompleted("Other exercise"));
    }
}
