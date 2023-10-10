
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        int elementsSize = elements.size();
        String elementOutput = "elements:";
        if (elementsSize == 1) {
            elementOutput = "element:";
        }
        String collectionInfo = "The collection " + name + " has " + elementsSize + " " + elementOutput;
        String elementsInfo = "";
        for (int i = 0; i < elementsSize; i++) {
            if (i == elementsSize - 1) {
                elementsInfo += elements.get(i);
            } else {
                elementsInfo += elements.get(i) + "\n";
            }
        }
        return collectionInfo + "\n" + elementsInfo;
    }
}
