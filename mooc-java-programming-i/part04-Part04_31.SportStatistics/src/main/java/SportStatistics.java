
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();

        ArrayList<Game> gameCollection = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String[] parts = fileScanner.nextLine().split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                gameCollection.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Team: ");
        String team = scan.nextLine();

        int playedGames = 0;
        int wins = 0;

        for (Game game : gameCollection) {
            if (game.hasTeam(team)) {
                playedGames++;
                if (game.winner().equals(team)) {
                    wins++;
                }
            }
        }

        System.out.println("Games: " + playedGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (playedGames - wins));
    }
}
