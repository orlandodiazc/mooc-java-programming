
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookCollection = new ArrayList();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            bookCollection.add(new Book(name, ageRecommendation));
        }

        System.out.println(bookCollection.size() + " books in total.");
        System.out.println("Books:");
        bookCollection.stream().sorted().forEach(book -> {
            System.out.println(book);
        });

    }

}
