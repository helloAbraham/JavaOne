package com.Abraham.genericsexamplethree;

import java.util.ArrayList;
import java.util.List;

public class SoccerTeam {
    private String teamName;
    private List<SoccerPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses =0;
    private int totalTies = 0;

    public SoccerTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(SoccerPlayer player) {
        if(!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Sunshine:");
        System.out.println(teamMembers);
    }
    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }

        return message;

    }

    @Override
    public String toString() {
        return teamName + " (Ranked "  + ranking() + ")";
    }
}
