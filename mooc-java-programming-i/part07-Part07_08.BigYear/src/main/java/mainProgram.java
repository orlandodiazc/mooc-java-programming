
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdCollection birds = new BirdCollection();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                Bird newBird = new Bird(name, latin);
                birds.add(newBird);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                boolean isFound = birds.observation(name);
                if (!isFound) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                System.out.println(birds.toString());
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                Bird bird = birds.findBird(name);
                if (bird != null) {
                    System.out.println(bird.toString());
                } else {
                    System.out.println("Bird not found!");
                }

            }
        }

    }

}
