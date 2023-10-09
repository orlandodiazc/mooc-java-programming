
public class Game {

    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public Game(String gameHomeTeam, String gameVisitingTeam, int gameHomePoints, int gameVisitingPoints) {
        this.homeTeam = gameHomeTeam;
        this.visitingTeam = gameVisitingTeam;
        this.homePoints = gameHomePoints;
        this.visitingPoints = gameVisitingPoints;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public boolean hasTeam(String team) {
        return this.homeTeam.equals(team) || this.visitingTeam.equals(team);
    }

    public String winner() {
        if (homePoints > visitingPoints) {
            return this.homeTeam;
        }
        return this.visitingTeam;
    }
}
