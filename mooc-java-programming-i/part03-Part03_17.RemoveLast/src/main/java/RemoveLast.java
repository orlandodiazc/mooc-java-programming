
import java.util.ArrayList;

public class RemoveLast {

    public static void removeLast(ArrayList<String> strings) {
        int sizeOfStrings = strings.size();
        if (sizeOfStrings != 0) {
            strings.remove(sizeOfStrings - 1);
        }
    }

    public static void main(String[] args) {
        // Try your method in here
    }

}
