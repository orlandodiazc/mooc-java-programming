package dictionary;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.Map;

public class SaveableDictionary {

    private String file;
    private Map<String, String> translations;

    public SaveableDictionary(String file) {
        this.translations = new HashMap();
        this.file = file;
    }

    public SaveableDictionary() {
        this(null);
    }

    public void add(String words, String translation) {
        translations.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        String translation = translations.getOrDefault(word, null);
        if (translation == null) {
            for (Map.Entry<String, String> entry : translations.entrySet()) {
                if (entry.getValue().equals(word)) {
                    translation = entry.getKey();
                    break;
                }
            }
        }
        return translation;
    }

    public void delete(String word) {
        if (translations.remove(word) == null) {
            translations.values().remove(word);
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNext()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file);) {
            for (Map.Entry<String, String> entry : translations.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
