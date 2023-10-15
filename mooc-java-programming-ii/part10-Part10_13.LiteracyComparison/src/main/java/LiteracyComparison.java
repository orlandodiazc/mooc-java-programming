
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> inputCollection = new ArrayList();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .forEach(s -> inputCollection.add(s));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        inputCollection.stream()
                .map(row -> row.split(","))
                .filter(p -> p.length >= 6)
                .sorted((p1, p2) -> Double.valueOf(p1[5]).compareTo(Double.valueOf(p2[5])))
                .forEach(p -> System.out.println(p[3] + " (" + p[4] + "), " + p[2].trim().split(" ")[0] + ", " + p[5]));
    }
}
