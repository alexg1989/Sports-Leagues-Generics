public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> cowboys = new Team<>("Cowboys");
        cowboys.addPlayer(joe);

        System.out.println(cowboys.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> eagles = new Team<>("Eagles");
        FootballPlayer tom = new FootballPlayer("Tom");
        eagles.addPlayer(tom);

        Team<FootballPlayer> giants = new Team<>("Giants");
        Team<FootballPlayer> redskins = new Team<>("Redskins");

        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");

        giants.matchResult(redskins, 1, 0);
        giants.matchResult(cowboys, 3, 8);

        cowboys.matchResult(redskins, 2, 1);

        footballLeague.add(cowboys);
        footballLeague.add(eagles);
        footballLeague.add(giants);
        footballLeague.add(redskins);

        footballLeague.showLeagueTable();























    }
}
