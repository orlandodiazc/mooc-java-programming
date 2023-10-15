
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        translations = new HashMap();
    }

    public void add(String word, String translation) {
        translations.putIfAbsent(word, new ArrayList());
        translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (translations.containsKey(word)) {
            return translations.get(word);
        }
        return new ArrayList();
    }

    public void remove(String word) {
        translations.remove(word);
    }
}
