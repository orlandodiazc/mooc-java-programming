
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> collection;

    public Abbreviations() {
        collection = new HashMap();
    }

    public void addAbbreviation(String abbr, String explanation) {
        collection.put(abbr, explanation);
    }

    public boolean hasAbbreviation(String abbr) {
        return collection.containsKey(abbr);
    }

    public String findExplanationFor(String abbr) {
        return collection.get(abbr);
    }
}
