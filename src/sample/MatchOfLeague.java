package sample;

import java.io.Serializable;

public class MatchOfLeague implements Serializable {

    private DateOfMatch dateOfMatch;           //date of the the  and data type is DateOfMatch which is in DateOfMatch class
    private String teamNumOne;           //team 1 of the match
    private int teamNumOneScoreGoals;      //team 1 score Goals
    private int teamNumOneReceiveGoals;   //team 2 score Goals
    private String teamNumTwo;             //team2 of the match

    public MatchOfLeague(){}   //default constructor MatchOfLeague class

    public MatchOfLeague(DateOfMatch dateOfMatch, String teamNumOne, int teamNumOneScoreGoals, int teamNumOneReceiveGoals, String teamNumTwo) { //parameterize constructor of MatchOfLeagueClass
        this.dateOfMatch = dateOfMatch;
        this.teamNumOne = teamNumOne;
        this.teamNumOneScoreGoals = teamNumOneScoreGoals;
        this.teamNumOneReceiveGoals = teamNumOneReceiveGoals;
        this.teamNumTwo = teamNumTwo;
    }

    //getter and setters for MatchOfLeague class

    public DateOfMatch getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(DateOfMatch dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    public String getTeamNumOne() {
        return teamNumOne;
    }

    public void setTeamNumOne(String teamNumOne) {
        this.teamNumOne = teamNumOne;
    }

    public int getTeamNumOneScoreGoals() {
        return teamNumOneScoreGoals;
    }

    public void setTeamNumOneScoreGoals(int teamNumOneScoreGoals) {
        this.teamNumOneScoreGoals = teamNumOneScoreGoals;
    }

    public int getTeamNumOneReceiveGoals() {
        return teamNumOneReceiveGoals;
    }

    public void setTeamNumOneReceiveGoals(int teamNumOneReceiveGoals) {
        this.teamNumOneReceiveGoals = teamNumOneReceiveGoals;
    }

    public String getTeamNumTwo() {
        return teamNumTwo;
    }

    public void setTeamNumTwo(String teamNumTwo) {
        this.teamNumTwo = teamNumTwo;
    }

    @Override
    public String toString() {
        return "MatchOfLeague{" +
                "dateOfMatch=" + dateOfMatch +
                ", teamNumOne='" + teamNumOne + '\'' +
                ", teamNumOneScoreGoals=" + teamNumOneScoreGoals +
                ", teamNumOneReceiveGoals=" + teamNumOneReceiveGoals +
                ", teamNumTwo='" + teamNumTwo + '\'' +
                '}';
    }
}
