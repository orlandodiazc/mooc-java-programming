
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("Word: ");
                String wordToAdd = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(wordToAdd, translation);
            } else if (command.equals("search")) {
                System.out.print("Word: ");
                String wordToTranslate = scanner.nextLine();
                String translation = dictionary.translate(wordToTranslate);
                if (translation != null) {
                    System.out.println(translation);
                } else {
                    System.out.println("Word " + wordToTranslate + " was not found");
                }
            }

            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }

}
