package com.Abraham.genericsexamplethree;
record SoccerPlayer(String name, String position){

}
public class Main {
    public static void main(String[] args) {
        SoccerTeam phillies = new SoccerTeam("Philadelphia Phillies");
        SoccerTeam astros = new SoccerTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new SoccerPlayer("B Harper", "Right Fielder");
        var marsh = new SoccerPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();
    };

    public static void scoreResult(SoccerTeam team1, int t1_score,
                                   SoccerTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
