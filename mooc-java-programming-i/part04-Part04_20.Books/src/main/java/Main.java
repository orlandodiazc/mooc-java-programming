
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookCollection = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            bookCollection.add(new Book(title, pages, publicationYear));
        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String informationToPrint = scanner.nextLine();

        if (informationToPrint.equals("everything")) {
            for (Book book : bookCollection) {
                System.out.println(book);
            }
        } else if (informationToPrint.equals("name")) {
            for (Book book : bookCollection) {
                System.out.println(book.getTitle());
            }
        }
    }
}
